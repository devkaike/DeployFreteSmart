package com.example.fretesmartofi.service;

import com.example.fretesmartofi.repository.ClienteRepository;
import com.example.fretesmartofi.repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

@Service
public class ContagemService {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private MotoristaRepository motoristaRepository;

    public long contarClientes() {
        return clienteRepository.count();
    }

    public long contarMotoristas() {
        return motoristaRepository.count();
    }

    public double calcularPorcentagemClientesUltimoMes() {
        LocalDate hoje = LocalDate.now();
        LocalDate mesPassado = hoje.minusMonths(1);
        Date dataMesPassado = Date.from(mesPassado.atStartOfDay(ZoneId.systemDefault()).toInstant());

        long totalClientes = clienteRepository.count();
        long clientesUltimoMes = clienteRepository.countByDataCadastroAfter(dataMesPassado);

        if (totalClientes == 0) {
            return 0;
        }

        return (double) clientesUltimoMes / totalClientes * 100;
    }

    public double calcularPorcentagemMotoristasUltimoMes() {
        LocalDate hoje = LocalDate.now();
        LocalDate mesPassado = hoje.minusMonths(1);
        Date dataMesPassado = Date.from(mesPassado.atStartOfDay(ZoneId.systemDefault()).toInstant());

        long totalMotoristas = motoristaRepository.count();
        long motoristasUltimoMes = motoristaRepository.countByDataCadastroAfter(dataMesPassado);

        if (totalMotoristas == 0) {
            return 0;
        }

        return (double) motoristasUltimoMes / totalMotoristas * 100;
    }
}
