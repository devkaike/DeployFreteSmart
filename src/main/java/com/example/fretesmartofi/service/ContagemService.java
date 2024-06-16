package com.example.fretesmartofi.service;

import com.example.fretesmartofi.model.StatusSolicitacao;
import com.example.fretesmartofi.repository.ClienteRepository;
import com.example.fretesmartofi.repository.MotoristaRepository;
import com.example.fretesmartofi.repository.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

@Service
public class ContagemService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private MotoristaRepository motoristaRepository;

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

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

    public double calcularFaturamentoConcluido() {
        Double resultado = solicitacaoRepository.sumValorByStatus(StatusSolicitacao.Concluido);
        return resultado != null ? resultado : 0.0;
    }

    public double obterFaturamentoUltimoMesConcluido() {
        LocalDate hoje = LocalDate.now();
        LocalDate primeiroDiaMesPassado = hoje.minusMonths(1).withDayOfMonth(1);
        LocalDate ultimoDiaMesPassado = primeiroDiaMesPassado.withDayOfMonth(primeiroDiaMesPassado.lengthOfMonth());

        LocalDateTime inicioMesPassadoDateTime = primeiroDiaMesPassado.atStartOfDay();
        LocalDateTime fimMesPassadoDateTime = ultimoDiaMesPassado.atTime(23, 59, 59);

        Double resultado = solicitacaoRepository.obterFaturamentoUltimoMes(inicioMesPassadoDateTime, fimMesPassadoDateTime, StatusSolicitacao.Concluido);
        return resultado != null ? resultado : 0.0;
    }

    public double obterFaturamentoMesAtual() {
        LocalDate hoje = LocalDate.now();
        LocalDate inicioMesAtual = hoje.withDayOfMonth(1);

        LocalDateTime inicioMesAtualDateTime = inicioMesAtual.atStartOfDay();
        LocalDateTime fimHojeDateTime = hoje.atTime(23, 59, 59);

        Double resultado = solicitacaoRepository.obterFaturamentoUltimoMes(inicioMesAtualDateTime, fimHojeDateTime, StatusSolicitacao.Concluido);
        return resultado != null ? resultado : 0.0;
    }

    public double calcularCrescimento() {
        double faturamentoMesPassado = obterFaturamentoUltimoMesConcluido();
        double faturamentoMesAtual = obterFaturamentoMesAtual();

        if (faturamentoMesPassado == 0) {
            return faturamentoMesAtual > 0 ? 100.0 : 0.0;
        }

        return ((faturamentoMesAtual - faturamentoMesPassado) / faturamentoMesPassado) * 100;
    }
}