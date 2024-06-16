package com.example.fretesmartofi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
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

        @ManyToOne
        @JoinColumn(name = "cliente_id", nullable = false)
        private Cliente cliente;

        @ManyToOne
        @JoinColumn(name = "motorista_id")
        private Motorista motorista;

        @Column(name = "local_partida", nullable = false)
        private String localPartida;

        @Column(name = "destino", nullable = false)
        private String destino;

        @Column(name = "data_partida", nullable = false)
        private LocalDateTime dataPartida;

        @Column(name = "valor_viagem", nullable = false)
        private BigDecimal valorViagem;

        @Column(name = "data_solicitacao", nullable = false)
        private LocalDateTime dataSolicitacao;

        @Column(name = "status", nullable = false)
        private String status;

        @Column(name = "tipo_carga")
        private String tipoCarga;

        @Column(name = "detalhes_carga", columnDefinition = "TEXT")
        private String detalhesCarga;

        @Column(name = "data_criacao", nullable = false, updatable = false)
        private LocalDateTime dataCriacao;

        @Column(name = "data_atualizacao")
        private LocalDateTime dataAtualizacao;

        @Column(name = "metodo_pagamento")
        private String metodoPagamento;

        @Column(name = "observacoes", columnDefinition = "TEXT")
        private String observacoes;

        @ManyToOne
        @JoinColumn(name = "viagem_id")
        private Viagem viagem;

        @PrePersist
        protected void onCreate() {
                dataCriacao = LocalDateTime.now();
        }

        @PreUpdate
        protected void onUpdate() {
                dataAtualizacao = LocalDateTime.now();
        }
}
