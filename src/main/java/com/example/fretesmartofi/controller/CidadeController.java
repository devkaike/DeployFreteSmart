package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.model.Cidade;
import com.example.fretesmartofi.model.Estado;
import com.example.fretesmartofi.service.CidadeService;
import com.example.fretesmartofi.service.EstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cidades")
public class CidadeController {

    @Autowired
    private CidadeService cidadeService;

    @GetMapping
    public List<Cidade> getAllCidades() {
        return cidadeService.getAllCidades();
    }

    @GetMapping("/{id}")
    public Optional<Cidade> getClienteById(@PathVariable Long id) {
        return cidadeService.getCidadeById(id);
    }

    @PostMapping
    public ResponseEntity<Cidade> createCidade(@RequestBody Cidade cidade) {
        try {
            return ResponseEntity.ok(cidadeService.saveCidade(cidade));
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cidade> updateCidade(@PathVariable Long id, @RequestBody Cidade cidade) {
        cidade.setId(id);
        try {
            return ResponseEntity.ok(cidadeService.saveCidade(cidade));
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteCidade(@PathVariable Long id) {
        cidadeService.deleteCidade(id);
    }
}
