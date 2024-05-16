package com.example.fretesmartofi.service;

import com.example.fretesmartofi.model.Motorista;
import com.example.fretesmartofi.repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotoristaService {
    @Autowired
    private MotoristaRepository motoristaRepository;

    public List<Motorista> getAllMotoristas() {
        return motoristaRepository.findAll();
    }

    public Optional<Motorista> getMotoristaById(Long id) {
        return motoristaRepository.findById(id);
    }

    public Motorista saveMotorista(Motorista motorista) {
        return motoristaRepository.save(motorista);
    }

    public void deleteMotorista(Long id) {
        motoristaRepository.deleteById(id);
    }
}
