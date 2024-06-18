package com.example.fretesmartofi.repository;

import com.example.fretesmartofi.model.Cidade;
import com.example.fretesmartofi.model.Cliente;
import com.example.fretesmartofi.model.Estado;
import com.example.fretesmartofi.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    long countByDataCadastroAfter(Date data);

    Optional<Cliente> findByUsuarioId(Long usuarioId);
}
