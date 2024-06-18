package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.model.Cliente;
import com.example.fretesmartofi.model.Usuario;
import com.example.fretesmartofi.service.ClienteService;
import com.example.fretesmartofi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;
    @Autowired
    private UsuarioService usuarioService;


    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @GetMapping("/{id}")
    public Optional<Cliente> getClienteById(@PathVariable Long id) {
        return clienteService.getClienteById(id);
    }

    @PostMapping
    public ResponseEntity<Cliente> createCliente(@RequestBody Cliente cliente) {
        Cliente savedCliente = clienteService.saveCliente(cliente);
        return ResponseEntity.ok(savedCliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> updateCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        cliente.setId(id);
        try {
            return ResponseEntity.ok(clienteService.saveCliente(cliente));
        } catch (DataIntegrityViolationException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("/usuarios/{id}")
    public Optional<Cliente> getUsuarioById(@PathVariable Long id) {
        return clienteService.getClienteByUsuario(id);
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }
}
