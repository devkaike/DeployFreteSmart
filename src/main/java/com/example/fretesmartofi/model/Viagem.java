package com.example.fretesmartofi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "Viagens")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Viagem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String destino;
    private LocalDateTime dataPartida;
    private LocalDateTime dataChegada;
    private String status; // Ex: "Pendente", "Em andamento", "Concluída"
    private BigDecimal custo;

    @ManyToOne
    @JoinColumn(name = "motorista_id")
    private Motorista motorista;

    @ManyToOne
    @JoinColumn(name = "caminhao_id")
    private Caminhao caminhao;
}
