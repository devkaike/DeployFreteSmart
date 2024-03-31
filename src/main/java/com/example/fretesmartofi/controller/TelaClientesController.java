package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.model.TelaClientesModel;
import com.example.fretesmartofi.repository.ITelaClientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("http://127.0.0.1:5500")
@RequestMapping("/telaCli")
public class TelaClientesController {

    @Autowired
    private ITelaClientes telaClientesInterface;

    @GetMapping("/listar")
    public List<TelaClientesModel> listaTelaClientes() {
        return (List<TelaClientesModel>) telaClientesInterface.findAll();
    }

    @CrossOrigin("http://127.0.0.1:5500")
    @PostMapping("/cadastrar")
    public TelaClientesModel criarViagem(@RequestBody TelaClientesModel telaClientesModel) {
        TelaClientesModel novaViagem = telaClientesInterface.save(telaClientesModel);
        return novaViagem;
    }

    @PutMapping("/editar")
    public TelaClientesModel editarViagem(@RequestBody TelaClientesModel telaClientesModel) {
        TelaClientesModel novaViagem = telaClientesInterface.save(telaClientesModel);
        return novaViagem;
    }

    @DeleteMapping("/deletar/{id}")
    public Optional<TelaClientesModel> excluirViagem(@PathVariable Long id) {
        Optional<TelaClientesModel> viagem = telaClientesInterface.findById(id);
        telaClientesInterface.deleteById(id);
        return viagem;
    }
}
