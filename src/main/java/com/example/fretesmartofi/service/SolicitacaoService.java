package com.example.fretesmartofi.service;

import com.example.fretesmartofi.model.Solicitacao;
import com.example.fretesmartofi.repository.SolicitacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitacaoService {

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

    public List<Solicitacao> getAllSolicitacoes() {
        return solicitacaoRepository.findAll();
    }

    public Optional<Solicitacao> getSolicitacaoById(Long id) {
        return solicitacaoRepository.findById(id);
    }

    public Solicitacao saveSolicitacao(Solicitacao solicitacao) {
        return solicitacaoRepository.save(solicitacao);
    }

    public void deleteSolicitacao(Long id) {
        solicitacaoRepository.deleteById(id);
    }
}
