package com.example.fretesmartofi.controller;


import com.example.fretesmartofi.model.MotoristaModel;
import com.example.fretesmartofi.repository.IMotorista;
import com.example.fretesmartofi.service.MotoristaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("127.0.0.1:5500")
@RequestMapping("/motoristas")
public class MotoristaController {

    @Autowired
    private MotoristaService motoristaService;

    @GetMapping("/listar")
    public List<MotoristaModel> listaMotoristas() {
        return (List<MotoristaModel>) motoristaService.getAllMotorista();
    }

    @CrossOrigin("http://127.0.0.1:5500")
    @PostMapping("/cadastrar")
    public MotoristaModel criarMotorista(@RequestBody MotoristaModel motoristaModel) {
        return motoristaService.insertMotorista(motoristaModel);
    }

    @PutMapping("/editar")
    public MotoristaModel editarMotorista(@RequestBody MotoristaModel motoristaModel) {
        return motoristaService.updateMotorista(motoristaModel);
    }

    @DeleteMapping("/deletar/{id}")
    public void excluirMotorista (@PathVariable Long id) {
        motoristaService.deleteMotorista(id);
    }
}
