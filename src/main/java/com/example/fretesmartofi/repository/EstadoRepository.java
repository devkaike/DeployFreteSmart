package com.example.fretesmartofi.repository;

import com.example.fretesmartofi.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long> {
    Estado findBySigla(String sigla);
}
