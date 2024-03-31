package com.example.fretesmartofi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "tela_clientes")
@Data // Lombok: Gera automaticamente os métodos getter, setter, equals, hashCode e toString.
@NoArgsConstructor // Lombok: Gera um construtor padrão sem argumentos.
@AllArgsConstructor // Lombok: Gera um construtor que inclui todos os campos da classe como argumentos.
public class TelaClientesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "partida", length = 200, nullable = false)
    private String partida;

    @Column(name = "destino", length = 200, nullable = false)
    private String destino;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_partida", nullable = false)
    private Date data_partida;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_chegada", nullable = false)
    private Date data_chegada;

    @Column(name = "produto", length = 200, nullable = false)
    private String produto;

    @Column(name = "quantidade", length = 20, nullable = false)
    private String quantidade;

    @Column(name = "peso", length = 20, nullable = false)
    private String peso;

    @Column(name = "valor", length = 20, nullable = false)
    private String valor;
}
