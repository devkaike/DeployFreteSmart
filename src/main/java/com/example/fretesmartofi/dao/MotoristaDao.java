package com.example.fretesmartofi.dao;

import com.example.fretesmartofi.model.MotoristaModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MotoristaDao extends CrudRepository<MotoristaModel, Long> {
    @Query(value = "SELECT u FROM MotoristaModel u WHERE u.nome LIKE %?1%")
    List<MotoristaModel> buscarPorNome(String nomeMotorista);
}
