package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.model.ClienteModel;
import com.example.fretesmartofi.repository.ICliente;
import com.example.fretesmartofi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("127.0.0.1:5500")
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/listar")
    public List<ClienteModel> listaClientes() {
        return clienteService.getAllCliente();
    }

    @CrossOrigin("http://127.0.0.1:5500")
    @PostMapping("/cadastrar")
    public ClienteModel criarCliente(@RequestBody ClienteModel clienteModel) {
        return clienteService.insertCliente(clienteModel);

    }

    @PutMapping("/editar")
    public ClienteModel editarCliente(@RequestBody ClienteModel clienteModel) {
        return clienteService.updateCliente(clienteModel);
    }

    @DeleteMapping("deletar/{id}")
    public void excluirCliente (@PathVariable Long id) {
        clienteService.deleteCliente(id);
    }

}
