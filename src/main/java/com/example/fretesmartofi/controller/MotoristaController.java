package com.example.fretesmartofi.controller;


import com.example.fretesmartofi.model.MotoristaModel;
import com.example.fretesmartofi.repository.IMotorista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("127.0.0.1:5500")
@RequestMapping("/motoristas")
public class MotoristaController {

    @Autowired
    private IMotorista motoristaInterface;

    @GetMapping("/listar")
    public List<MotoristaModel> listaMotoristas() {
        return (List<MotoristaModel>) motoristaInterface.findAll();
    }

    @CrossOrigin("http://127.0.0.1:5500")
    @PostMapping("/cadastrar")
    public MotoristaModel criarMotorista(@RequestBody MotoristaModel motoristaModel) {
        MotoristaModel novoMotorista = motoristaInterface.save(motoristaModel);
        return novoMotorista;
    }

    @PutMapping("/editar")
    public MotoristaModel editarMotorista(@RequestBody MotoristaModel motoristaModel) {
        MotoristaModel novoMotorista = motoristaInterface.save(motoristaModel);
        return novoMotorista;
    }

    @DeleteMapping("/deletar/{id}")
    public Optional<MotoristaModel> excluirMotorista (@PathVariable Long id) {
        Optional<MotoristaModel> motorista = motoristaInterface.findById(id);
        motoristaInterface.deleteById(id);
        return motorista;
    }
}
