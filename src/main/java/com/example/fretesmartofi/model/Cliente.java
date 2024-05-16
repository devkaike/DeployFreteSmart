package com.example.fretesmartofi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @NotBlank
    @Column(name = "sobrenome", length = 200, nullable = false)
    private String sobrenome;
    @NotBlank
    @Column(name = "cpf", length = 14, nullable = false, unique = true)
    private String cpf;

    @NotBlank
    @Column(name = "celular", length = 15, nullable = false)
    private String celular;

    @NotBlank
    @Email
    @Column(name = "email", length = 200, nullable = false, unique = true)
    private String email;

    @NotBlank
    @Column(name = "cep", length = 9, nullable = false)
    private String cep;

    @NotBlank
    @Column(name = "endereco", length = 255, nullable = false)
    private String endereco;

    @Column(name = "complemento", length = 255)
    private String complemento;

    @NotBlank
    @Column(name = "bairro", length = 100, nullable = false)
    private String bairro;

    @NotBlank
    @Column(name = "cidade", length = 100, nullable = false)
    private String cidade;

    @NotBlank
    @Column(name = "estado", length = 2, nullable = false)
    private String estado;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
