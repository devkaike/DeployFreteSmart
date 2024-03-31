package com.example.fretesmartofi.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "motoristas")
@Data // Lombok: Gera automaticamente os métodos getter, setter, equals, hashCode e toString.
@NoArgsConstructor // Lombok: Gera um construtor padrão sem argumentos.
@AllArgsConstructor // Lombok: Gera um construtor que inclui todos os campos da classe como argumentos.
public class MotoristaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 200, nullable = false)
    private String nome;

    @Column(length = 200, nullable = false)
    private String sobrenome;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false)
    private Date dataNascimento;

    @Column(length = 14, nullable = false, unique = true)
    private String cpf;

    @Column(length = 9, nullable = false, unique = true)
    private String cnh;

    @Column(length = 20, nullable = false)
    private String telefone;

    @Column(length = 200, nullable = false)
    private String marca;

    @Column(length = 8, nullable = false, unique = true)
    private String placa;

    @Column(length = 10, nullable = false)
    private String ano;

    @Column(length = 50, nullable = false)
    private String peso;

    @Column(nullable = false)
    private int numEixos;

    @Column(length = 20, nullable = false, unique = true)
    private String numChassi;

    @Column(length = 20, nullable = false)
    private String cor;

    @Column(length = 200, nullable = false)
    private String ufOrigem;

    @Column(length = 12, nullable = false, unique = true)
    private String renavam;

    @Column(nullable = false)
    private String senha;
}
