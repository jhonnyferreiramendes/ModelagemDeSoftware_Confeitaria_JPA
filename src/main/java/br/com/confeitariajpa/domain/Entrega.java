package br.com.confeitariajpa.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;


import javax.persistence.*;


@Entity
@Data
@DiscriminatorValue("ENTREGA")
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Entrega extends Endereco {

    protected double distancia;
    protected double valorEntrega;

    //@OneToOne
    //protected Endereco endereco;

    public Entrega(String rua, String numero, String bairro, String cidade) {
        super(rua, numero, bairro, cidade);

    }

    public void caucularDistancia(double distancia) {
        this.valorEntrega = distancia * 4.50;

        System.out.println("\nValor da entrega: " + valorEntrega);
    }

    public void infoEndereco() {
        System.out.println("Informações do endereço:");
        System.out.println("Rua: " + getRua() + "\nNumero: " + getNumero() + "\nBairro: " + getBairro() + "\nCidade: " + getCidade());
    }


}
