package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.service.ContagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/contagem")
public class ContagemController {
    @Autowired
    private ContagemService contagemService;

    @GetMapping("/clientes")
    public long contarClientes() {
        return contagemService.contarClientes();
    }

    @GetMapping("/motoristas")
    public long contarMotoristas() {
        return contagemService.contarMotoristas();
    }

    @GetMapping("/clientes/ultimo-mes")
    public double porcentagemClientesUltimoMes() {
        return contagemService.calcularPorcentagemClientesUltimoMes();
    }

    @GetMapping("/motoristas/ultimo-mes")
    public double porcentagemMotoristasUltimoMes() {
        return contagemService.calcularPorcentagemMotoristasUltimoMes();
    }
}
