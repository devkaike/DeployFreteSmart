package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.model.Motorista;
import com.example.fretesmartofi.service.MotoristaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/motoristas")
public class MotoristaController {
    @Autowired
    private MotoristaService motoristaService;

    @GetMapping
    public List<Motorista> getAllClientes() {
        return motoristaService.getAllMotoristas();
    }

    @GetMapping("/{id}")
    public Optional<Motorista> getMotoristaById(@PathVariable Long id) {
        return motoristaService.getMotoristaById(id);
    }

    @PostMapping
    public Motorista createMotorista(@RequestBody Motorista motorista) {
        return motoristaService.saveMotorista(motorista);
    }

    @PutMapping("/{id}")
    public Motorista updateMotorista(@PathVariable Long id, @RequestBody Motorista motorista) {
        motorista.setId(id);
        return motoristaService.saveMotorista(motorista);
    }

    @DeleteMapping("/{id}")
    public void deleteMotorista(@PathVariable Long id) {
        motoristaService.deleteMotorista(id);
    }
}
