package com.example.fretesmartofi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Administradores")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Sobrenome é obrigatório")
    private String sobrenome;
    @NotBlank(message = "CPF é obrigatório")
    private String cpf;

    @NotBlank(message = "Telefone é obrigatório")
    private String celular;

    @NotBlank(message = "E-mail é obrigatório")
    @Email
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

    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
