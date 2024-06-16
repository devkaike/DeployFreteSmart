package com.example.fretesmartofi.model;

public enum StatusSolicitacao {
    Pendente("Pendente"),
    Aceito("Aceito"),
    Concluido("Concluído"),
    Cancelado("Cancelado");

    private String status;

    StatusSolicitacao(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}
