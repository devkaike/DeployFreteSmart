package com.example.fretesmartofi.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Caminhoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Caminhao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marca;

    private String placa;

    @Enumerated(EnumType.STRING)
    private Uf ufPlaca;

    private String ano;

    private double pesoMaximoCarga;

    private Integer quantidadeEixos;

    @Enumerated(EnumType.STRING)
    private TipoCarroceria tipoCarroceria;

    private String chassis;

    private String cor;

    private String renavam;

    // Definição da enum Uf
    public enum Uf {
        AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, MT, MS, MG, PA, PB, PR, PE, PI, RJ, RN, RS, RO, RR, SC, SP, SE, TO
    }

    // Definição da enum TipoCarroceria
    public enum TipoCarroceria {
        BAU, GRANELEIRO, SIDER, CARGA_SECA, FRIGORIFICO
    }
}
