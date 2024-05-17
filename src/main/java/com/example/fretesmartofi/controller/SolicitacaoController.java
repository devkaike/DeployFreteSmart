package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.model.Solicitacao;
import com.example.fretesmartofi.model.Usuario;
import com.example.fretesmartofi.service.SolicitacaoService;
import com.example.fretesmartofi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/solicitacoes")
public class SolicitacaoController {

    @Autowired
    private SolicitacaoService solicitacaoService;

    @GetMapping
    public List<Solicitacao> getAllSolicitacoes() {
        return solicitacaoService.getAllSolicitacoes();
    }

    @GetMapping("/{id}")
    public Optional<Solicitacao> getSolicitacaoById(@PathVariable Long id) {
        return solicitacaoService.getSolicitacaoById(id);
    }

    @PostMapping
    public Solicitacao createSolicitacao(@RequestBody Solicitacao solicitacao) {
        return solicitacaoService.saveSolicitacao(solicitacao);
    }

    @PutMapping("/{id}")
    public Solicitacao updateSolicitacao(@PathVariable Long id, @RequestBody Solicitacao solicitacao) {
        solicitacao.setId(id);
        return solicitacaoService.saveSolicitacao(solicitacao);
    }

    @DeleteMapping("/{id}")
    public void deleteSolicitacao(@PathVariable Long id) {
        solicitacaoService.deleteSolicitacao(id);
    }
}
