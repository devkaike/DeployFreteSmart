package com.example.fretesmartofi.service;

import com.example.fretesmartofi.dao.MotoristaDao;
import com.example.fretesmartofi.model.MotoristaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MotoristaService {
    @Autowired
    private MotoristaDao motoristaDao;

    //buscar todos os motoristas
    public List<MotoristaModel> getAllMotorista(){
        return (List<MotoristaModel>) motoristaDao.findAll();
    }

    // add um novo motorista
    public MotoristaModel insertMotorista(MotoristaModel motoristaModel){
        return motoristaDao.save(motoristaModel);
    }

    // atualizar motorista
    public MotoristaModel updateMotorista(MotoristaModel motoristaModel){
        return motoristaDao.save(motoristaModel);
    }

    // deletar motorista
    public void deleteMotorista(Long id){
        motoristaDao.deleteById(id);
    }

    // buscar pelo nome do motorista
    public List<MotoristaModel> getByNomeMotorista(String nome){
        return (List<MotoristaModel>) motoristaDao.buscarPorNome(nome);
    }
}
