package com.example.fretesmartofi.repository;

import com.example.fretesmartofi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    long countByDataCadastroAfter(Date data);
}
