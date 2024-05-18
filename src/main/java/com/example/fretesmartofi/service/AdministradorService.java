package com.example.fretesmartofi.service;

import com.example.fretesmartofi.model.Administrador;
import com.example.fretesmartofi.model.Cliente;
import com.example.fretesmartofi.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdministradorService {
    @Autowired
    private AdministradorRepository administradorRepository;

    public List<Administrador> getAllAdm(){
        return administradorRepository.findAll();
    }

    public Optional<Administrador> getAdmById(Long id) {
        return administradorRepository.findById(id);
    }

    public Administrador saveAdm(Administrador administrador) {
        return administradorRepository.save(administrador);
    }

    public void deleteAdm(Long id) {
        administradorRepository.deleteById(id);
    }
}
