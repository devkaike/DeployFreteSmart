package com.example.fretesmartofi.service;

import com.example.fretesmartofi.model.Motorista;
import com.example.fretesmartofi.model.Viagem;
import com.example.fretesmartofi.repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ViagemService {

    @Autowired
    private ViagemRepository viagemRepository;

    public Viagem saveViagem(Viagem viagem) {
        return viagemRepository.save(viagem);
    }

    public Viagem aceptViagem(Long viagemId, Motorista motorista) {
        Viagem viagem = viagemRepository.findById(viagemId)
                .orElseThrow(() -> new RuntimeException("Viagem não encontrada"));
        viagem.setMotorista(motorista);
        viagem.setStatus("Em andamento");
        return viagemRepository.save(viagem);
    }

    public List<Viagem> getAllViagens() {
        return viagemRepository.findAll();
    }

    public Optional<Viagem> getViagemById(Long id) {
        return viagemRepository.findById(id);
    }

    public void deleteViagem(Long id) {
        viagemRepository.deleteById(id);
    }
}
