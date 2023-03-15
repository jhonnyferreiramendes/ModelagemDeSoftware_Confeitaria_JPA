package br.com.confeitariajpa.enums;

public enum FormaDePagamento {

    DINHEIRO, CARTAO, PIX;

    public static FormaDePagamento getDINHEIRO(){return DINHEIRO;}
    public static FormaDePagamento getCARTAO(){return CARTAO;}
    public static FormaDePagamento gePIX(){return PIX;}
}
