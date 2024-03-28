package com.example.fretesmartofi.repository;

import com.example.fretesmartofi.model.ClienteModel;
import org.springframework.data.repository.CrudRepository;

public interface ICliente extends CrudRepository<ClienteModel, Integer> {
}
