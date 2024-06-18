package com.example.fretesmartofi.model;

public enum StatusSolicitacao {
    Pendente("Pendente"),
    Aceito("Aceito"),
    Concluido("Concluído"),
    Cancelado("Cancelado"),

    Aguardando_Pagamento("Aguardando Pagamento");

    private String status;

    StatusSolicitacao(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}
