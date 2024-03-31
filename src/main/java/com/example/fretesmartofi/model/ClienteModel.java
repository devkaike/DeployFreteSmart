package com.example.fretesmartofi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientes")
@Data // Lombok: Gera automaticamente os métodos getter, setter, equals, hashCode e toString.
@NoArgsConstructor // Lombok: Gera um construtor padrão sem argumentos.
@AllArgsConstructor // Lombok: Gera um construtor que inclui todos os campos da classe como argumentos.
public class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "sobrenome", length = 200, nullable = false)
    private String sobrenome;

    @Column(name = "email", length = 200, nullable = false)
    private String email;

    @Column(name = "senha", columnDefinition = "TEXT", nullable = false)
    private String senha;

    @Column(name = "confirmar_senha", columnDefinition = "TEXT", nullable = false)
    private String confirmarSenha;

    @Column(name = "localidade", length = 200, nullable = false)
    private String localidade;

    @Column(name = "cpf", length = 200, nullable = false)
    private String cpf;

    @Column(name = "telefone", length = 15, nullable = false)
    private String telefone;
}
