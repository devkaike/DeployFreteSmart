package com.example.fretesmartofi.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "motoristas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Motorista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Nome é obrigatório")
    private String nome;

    @NotBlank(message = "Sobrenome é obrigatório")
    private String sobrenome;

    @Temporal(TemporalType.DATE)
    private Date dataNascimento;

    @NotBlank(message = "CPF é obrigatório")
    private String cpf;

    @NotBlank
    @Email
    @Column(name = "email", length = 200, nullable = false, unique = true)
    private String email;
    @NotBlank(message = "CNH é obrigatória")
    private String cnh;

    @Enumerated(EnumType.STRING)
    private TipoCnh tipoCnh;

    @NotBlank(message = "Celular é obrigatório")
    private String celular;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "caminhao_id")
    private Caminhao caminhao;

    // Definição da enum TipoCnh
    public enum TipoCnh {
        A, B, C, D, E
    }
}
