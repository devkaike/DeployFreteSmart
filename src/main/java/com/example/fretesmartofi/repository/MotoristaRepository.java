package com.example.fretesmartofi.repository;

import com.example.fretesmartofi.model.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
    Optional<Motorista> findByUsuarioId(Long usuarioId);

    long countByDataCadastroAfter(Date data);
}

