package com.example.fretesmartofi.service;

import com.example.fretesmartofi.model.Cidade;
import com.example.fretesmartofi.model.Estado;
import com.example.fretesmartofi.repository.CidadeRepository;
import com.example.fretesmartofi.repository.EstadoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EstadoService {
    @Autowired
    private EstadoRepository estadoRepository;
    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Estado> getAllEstados() {
        return estadoRepository.findAll();
    }

    public Optional<Estado> getEstadoById(Long id) {
        return estadoRepository.findById(id);
    }

    public Estado saveEstado(Estado estado) {
        return estadoRepository.save(estado);
    }

    public void deleteEstado(Long id) {
        estadoRepository.deleteById(id);
    }

    public List<Cidade> getCidadesByEstadoSigla(String sigla) {
        Estado estado = estadoRepository.findBySigla(sigla);
        if (estado != null) {
            return cidadeRepository.findByEstado(estado);
        }
        return Collections.emptyList();
    }
}
