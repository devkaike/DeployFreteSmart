package com.example.fretesmartofi.service;

import com.example.fretesmartofi.dao.ClienteDao;
import com.example.fretesmartofi.model.ClienteModel;

import com.example.fretesmartofi.model.MotoristaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClienteService {
    @Autowired
    private ClienteDao clienteDao;

    public List<ClienteModel> getAllCliente(){
        return (List<ClienteModel>) clienteDao.findAll();
    }

    public ClienteModel insertCliente(ClienteModel clienteModel){
        return clienteDao.save(clienteModel);
    }

    public ClienteModel updateCliente(ClienteModel clienteModel){
        return clienteDao.save(clienteModel);
    }

    public void deleteCliente(Long id){
        clienteDao.deleteById(id);
    }

    public List<ClienteModel> getByNomeCliente(String nome){
        return clienteDao.buscarPorNome(nome);
    }

}

