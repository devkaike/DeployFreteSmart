package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.model.Motorista;
import com.example.fretesmartofi.service.MotoristaService;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/motoristas")
public class MotoristaController {
    @Autowired
    private MotoristaService motoristaService;

    @GetMapping
    public List<Motorista> getAllMotoristas() {
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

    @GetMapping("/usuario/{usuarioId}")
    public ResponseEntity<Motorista> getMotoristaByUsuarioId(@PathVariable Long usuarioId) {
        try {
            Motorista motorista = motoristaService.getMotoristaByUsuarioId(usuarioId);
            return ResponseEntity.ok(motorista);
        } catch (EntityNotFoundException e) {
            return ResponseEntity.status(404).body(null);
        }
    }
}
