package com.example.fretesmartofi.service;

import com.example.fretesmartofi.model.Cidade;
import com.example.fretesmartofi.model.Cliente;
import com.example.fretesmartofi.repository.CidadeRepository;
import com.example.fretesmartofi.repository.ClienteRepository;
import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private CidadeRepository cidadeRepository;

    public List<Cliente> getAllClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> getClienteById(Long id) {
        return clienteRepository.findById(id);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    @Transactional
    public Cliente saveCliente(Cliente cliente) {
        // Verifica se a cidade não é nula e contém um ID válido
        if (cliente.getCidade() == null || cliente.getCidade().getId() == null) {
            throw new IllegalArgumentException("Cidade e ID da cidade não podem ser nulos");
        }

        // Carrega a cidade existente pelo ID
        Cidade cidade = cidadeRepository.findById(cliente.getCidade().getId())
                .orElseThrow(() -> new EntityNotFoundException("Cidade não encontrada"));

        // Define a cidade no cliente
        cliente.setCidade(cidade);

        // Salva o cliente
        return clienteRepository.save(cliente);
    }
}
