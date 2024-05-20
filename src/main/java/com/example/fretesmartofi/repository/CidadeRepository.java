package com.example.fretesmartofi.repository;

import com.example.fretesmartofi.model.Cidade;
import com.example.fretesmartofi.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long> {
    List<Cidade> findByEstado(Estado estado);
}
