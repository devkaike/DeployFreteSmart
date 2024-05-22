package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.model.Motorista;
import com.example.fretesmartofi.model.Viagem;
import com.example.fretesmartofi.service.ViagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/viagens")
public class ViagemController {

    @Autowired
    private ViagemService viagemService;

    @GetMapping
    public List<Viagem> getAllViagens() {
        return viagemService.getAllViagens();
    }

    @GetMapping("/{id}")
    public Optional<Viagem> getViagemById(@PathVariable Long id) {
        return viagemService.getViagemById(id);
    }

    @PostMapping
    public Viagem saveViagem(@RequestBody Viagem viagem) {
        return viagemService.saveViagem(viagem);
    }

    @PutMapping("/{id}/aceitar")
    public Viagem aceptViagem(@PathVariable Long id, @RequestBody Motorista motorista) {
        return viagemService.aceptViagem(id, motorista);
    }

    @PutMapping("/{id}")
    public Viagem updateViagem(@PathVariable Long id, @RequestBody Viagem viagem) {
        viagem.setId(id);
        return viagemService.saveViagem(viagem);
    }

    @DeleteMapping("/{id}")
    public void deleteViagem(@PathVariable Long id) {
        viagemService.deleteViagem(id);
    }
}
