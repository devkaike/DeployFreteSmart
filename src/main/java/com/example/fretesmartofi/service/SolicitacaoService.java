package com.example.fretesmartofi.service;

import com.example.fretesmartofi.model.Solicitacao;
import com.example.fretesmartofi.model.Viagem;
import com.example.fretesmartofi.repository.SolicitacaoRepository;
import com.example.fretesmartofi.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SolicitacaoService {

    @Autowired
    private SolicitacaoRepository solicitacaoRepository;

    @Autowired
    private ViagemRepository viagemRepository;

    public List<Solicitacao> getAllSolicitacoes() {
        return solicitacaoRepository.findAll();
    }

    public Optional<Solicitacao> getSolicitacaoById(Long id) {
        return solicitacaoRepository.findById(id);
    }

    public Solicitacao saveSolicitacao(Solicitacao solicitacao) {
        // Verifica se a viagem está associada e não está salva ainda
        if (solicitacao.getViagem() != null && solicitacao.getViagem().getId() == null) {
            // Salva a viagem primeiro
            Viagem savedViagem = viagemRepository.save(solicitacao.getViagem());
            solicitacao.setViagem(savedViagem);
        }
        // Salva a solicitação
        return solicitacaoRepository.save(solicitacao);
    }

    public void deleteSolicitacao(Long id) {
        solicitacaoRepository.deleteById(id);
    }
}
