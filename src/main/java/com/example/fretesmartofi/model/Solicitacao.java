package com.example.fretesmartofi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Solicitacoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Solicitacao {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String descricao;
        private LocalDateTime dataSolicitacao;
        private String status; // Ex: "Pendente", "Aprovada", "Rejeitada"
        private String motivo;

        @ManyToOne
        @JoinColumn(name = "cliente_id")
        private Cliente cliente;

        @ManyToOne
        @JoinColumn(name = "viagem_id")
        private Viagem viagem;
}
