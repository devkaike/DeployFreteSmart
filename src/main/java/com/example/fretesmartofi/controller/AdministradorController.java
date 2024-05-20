package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.model.Administrador;
import com.example.fretesmartofi.service.AdministradorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/administradores")
public class AdministradorController {

    @Autowired
    private AdministradorService administradorService;

    @GetMapping
    public List<Administrador> getAllAdm() {
        return administradorService.getAllAdm();
    }

    @GetMapping("/{id}")
    public Optional<Administrador> getAdmById(@PathVariable Long id) {
        return administradorService.getAdmById(id);
    }

    @PostMapping
    public ResponseEntity<Administrador> createAdm(@RequestBody Administrador administrador) {
        try {
            return ResponseEntity.ok(administradorService.saveAdm(administrador));
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Administrador> updateAdm(@PathVariable Long id, @RequestBody Administrador administrador) {
        administrador.setId(id);
        try {
            return ResponseEntity.ok(administradorService.saveAdm(administrador));
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteAdm(@PathVariable Long id) {
        administradorService.deleteAdm(id);
    }
}
