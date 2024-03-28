package com.example.fretesmartofi.controller;

import com.example.fretesmartofi.model.ClienteModel;
import com.example.fretesmartofi.repository.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("127.0.0.1:5500")
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ICliente clienteInteface;

    @GetMapping("/listar")
    public List<ClienteModel> listaClientes() {
        return (List<ClienteModel>) clienteInteface.findAll();
    }

    @CrossOrigin("http://127.0.0.1:5500")
    @PostMapping("/cadastrar")
    public ClienteModel criarCliente(@RequestBody ClienteModel clienteModel) {
        ClienteModel novoCliente = clienteInteface.save(clienteModel);
        return novoCliente;
    }

    @PutMapping("/editar")
    public ClienteModel editarCliente(@RequestBody ClienteModel clienteModel) {
        ClienteModel novoCliente = clienteInteface.save(clienteModel);
        return novoCliente;
    }

    @DeleteMapping("deletar/{id}")
    public Optional<ClienteModel> excluirCliente (@PathVariable Integer id) {
        Optional<ClienteModel> cliente = clienteInteface.findById(id);
        clienteInteface.deleteById(id);
        return cliente;
    }

}
