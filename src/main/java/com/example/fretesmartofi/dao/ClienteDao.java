package com.example.fretesmartofi.dao;

import com.example.fretesmartofi.model.ClienteModel;
import com.example.fretesmartofi.model.MotoristaModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteDao extends CrudRepository<ClienteModel, Long> {

    @Query(value = "SELECT u FROM ClienteModel u WHERE u.nome LIKE %?1%")
    List<ClienteModel> buscarPorNome(String nomeCliente);
}
