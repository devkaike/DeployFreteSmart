package com.example.fretesmartofi.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "motoristas")
public class MotoristaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nome", length = 200, nullable = false)
    private String nome;

    @Column(name = "sobrenome", length = 200, nullable = false)
    private String sobrenome;

    @Temporal(TemporalType.DATE)
    @Column(name = "data_nascimento", nullable = false)
    private Date data_nascimento;

    @Column(name = "cpf", length = 14, nullable = false)
    private String cpf;

    @Column(name = "cnh", length = 9, nullable = false)
    private String cnh;

    @Column(name = "telefone", length = 20, nullable = false)
    private String telefone;

    @Column(name = "tipo_unidade", length = 200, nullable = false)
    private String tipo_unidade;

    @Column(name = "marca", length = 200, nullable = false)
    private String marca;

    @Column(name = "placa", length = 8, nullable = false)
    private String placa;

    @Column(name = "ano", length = 10, nullable = false)
    private String ano;

    @Column(name = "peso", length = 50, nullable = false)
    private String peso;

    @Column(name = "num_eixos", length = 20, nullable = false)
    private String num_eixos;

    @Column(name = "num_chassi", length = 20, nullable = false)
    private String num_chassi;

    @Column(name = "cor", length = 20, nullable = false)
    private String cor;

    @Column(name = "uf_origem", length = 200, nullable = false)
    private String uf_origem;

    @Column(name = "renavam", length = 12, nullable = false)
    private String renavam;

    @Column(name = "senha", columnDefinition = "TEXT", nullable = false)
    private String senha;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Date getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipo_unidade() {
        return tipo_unidade;
    }

    public void setTipo_unidade(String tipo_unidade) {
        this.tipo_unidade = tipo_unidade;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getNum_eixos() {
        return num_eixos;
    }

    public void setNum_eixos(String num_eixos) {
        this.num_eixos = num_eixos;
    }

    public String getNum_chassi() {
        return num_chassi;
    }

    public void setNum_chassi(String num_chassi) {
        this.num_chassi = num_chassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getUf_origem() {
        return uf_origem;
    }

    public void setUf_origem(String uf_origem) {
        this.uf_origem = uf_origem;
    }

    public String getRenavam() {
        return renavam;
    }

    public void setRenavam(String renavam) {
        this.renavam = renavam;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
