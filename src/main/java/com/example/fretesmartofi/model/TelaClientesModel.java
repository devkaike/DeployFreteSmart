package com.example.fretesmartofi.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tela_clientes")
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getData_partida() {
        return data_partida;
    }

    public void setData_partida(Date data_partida) {
        this.data_partida = data_partida;
    }

    public Date getData_chegada() {
        return data_chegada;
    }

    public void setData_chegada(Date data_chegada) {
        this.data_chegada = data_chegada;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
