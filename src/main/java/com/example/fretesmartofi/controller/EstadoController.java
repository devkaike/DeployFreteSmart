package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.model.Cidade;
import com.example.fretesmartofi.model.Cliente;
import com.example.fretesmartofi.model.Estado;
import com.example.fretesmartofi.service.ClienteService;
import com.example.fretesmartofi.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estados")
public class EstadoController {

    @Autowired
    private EstadoService estadoService;

    @GetMapping
    public List<Estado> getAllEstados() {
        return estadoService.getAllEstados();
    }

    @GetMapping("/{id}")
    public Optional<Estado> getClienteById(@PathVariable Long id) {
        return estadoService.getEstadoById(id);
    }

    @PostMapping
    public ResponseEntity<Estado> createEstado(@RequestBody Estado cliente) {
        try {
            return ResponseEntity.ok(estadoService.saveEstado(cliente));
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estado> updateEstado(@PathVariable Long id, @RequestBody Estado estado) {
        estado.setId(id);
        try {
            return ResponseEntity.ok(estadoService.saveEstado(estado));
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteEstado(@PathVariable Long id) {
        estadoService.deleteEstado(id);
    }

    @GetMapping("/{sigla}/cidades")
    public ResponseEntity<List<Cidade>> getCidadesByEstadoSigla(@PathVariable String sigla) {
        List<Cidade> cidades = estadoService.getCidadesByEstadoSigla(sigla);
        if (cidades.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(cidades);
    }
}
