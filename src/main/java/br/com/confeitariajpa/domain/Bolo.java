package br.com.confeitariajpa.domain;

import br.com.confeitariajpa.enums.FormaDePagamento;
import br.com.confeitariajpa.enums.Sabor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Bolo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private double peso;
    private double preco;
    private Sabor sabor;
    private double totalRecheio;
    private double valoTotal;


    public void cacucularValorBaunilha(double peso, double preco, Sabor sabor) {
        System.out.println("Sabor: " + sabor);
        double recheioBaunilha = peso *( 10 * 2.50);
        System.out.println("Valor do recheio de baunilha: " + recheioBaunilha);
        System.out.println("Valor total do bolo de baunilha: "+ preco);
        totalRecheio += recheioBaunilha;
        valoTotal +=(preco + totalRecheio);
        System.out.println("Valor total " + valoTotal);

    }


    public void caucularValorChocolate (double peso, double preco, Sabor sabor) {
        System.out.println("Sabor: " + sabor);
        double recheioChocolate = peso *(1.80* 10);
        System.out.println("Valor do recheio de chocolate: " + recheioChocolate);
        System.out.println("Valor do produto: "+preco);
        totalRecheio += recheioChocolate;
        valoTotal +=(preco+ totalRecheio);
        System.out.println("Valor total " + valoTotal);
    }


}
