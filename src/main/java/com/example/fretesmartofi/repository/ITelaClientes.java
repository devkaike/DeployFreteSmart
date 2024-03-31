package com.example.fretesmartofi.repository;

import com.example.fretesmartofi.model.TelaClientesModel;
import org.springframework.data.repository.CrudRepository;

public interface ITelaClientes extends CrudRepository<TelaClientesModel, Long> {
}
