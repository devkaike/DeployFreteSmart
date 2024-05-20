package com.example.fretesmartofi.service;

import com.example.fretesmartofi.model.Cidade;
import com.example.fretesmartofi.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CidadeService {
    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cidade> getAllCidades() {
        return cidadeRepository.findAll();
    }

    public Optional<Cidade> getCidadeById(Long id) {
        return cidadeRepository.findById(id);
    }

    public Cidade saveCidade(Cidade cidade) {
        return cidadeRepository.save(cidade);
    }

    public void deleteCidade(Long id) {
        cidadeRepository.deleteById(id);
    }
}
