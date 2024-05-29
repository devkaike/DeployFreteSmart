package com.example.fretesmartofi.service;

import com.example.fretesmartofi.model.Caminhao;
import com.example.fretesmartofi.model.Cidade;
import com.example.fretesmartofi.model.Motorista;
import com.example.fretesmartofi.model.Usuario;
import com.example.fretesmartofi.repository.CaminhaoRepository;
import com.example.fretesmartofi.repository.CidadeRepository;
import com.example.fretesmartofi.repository.MotoristaRepository;
import com.example.fretesmartofi.repository.UsuarioRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MotoristaService {
    @Autowired
    private MotoristaRepository motoristaRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private CaminhaoRepository caminhaoRepository;

    public List<Motorista> getAllMotoristas() {
        return motoristaRepository.findAll();
    }

    public Optional<Motorista> getMotoristaById(Long id) {
        return motoristaRepository.findById(id);
    }

    public Motorista saveMotorista(Motorista motorista) {
        if (motorista.getCaminhao() != null) {
            Caminhao caminhao = caminhaoRepository.findById(motorista.getCaminhao().getId())
                    .orElseThrow(() -> new EntityNotFoundException("Caminhao not found"));
            motorista.setCaminhao(caminhao);
        }

        if (motorista.getCidade() != null) {
            Cidade cidade = cidadeRepository.findById(motorista.getCidade().getId())
                    .orElseThrow(() -> new EntityNotFoundException("Cidade not found"));
            motorista.setCidade(cidade);
        }

        if (motorista.getUsuario() != null) {
            Usuario usuario = usuarioRepository.findById(motorista.getUsuario().getId())
                    .orElseThrow(() -> new EntityNotFoundException("Usuario not found"));
            motorista.setUsuario(usuario);
        }

        return motoristaRepository.save(motorista);
    }

    public void deleteMotorista(Long id) {
        motoristaRepository.deleteById(id);
    }
}
