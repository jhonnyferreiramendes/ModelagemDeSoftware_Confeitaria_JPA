package br.com.confeitariajpa.domain;

import br.com.confeitariajpa.enums.FormaDePagamento;
import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("Cliente")
@Builder

public class Cliente {

   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String nome;
    @Column(unique = true, nullable = false)
    private String cpf;

    //@Column(nullable = false)
    //@OneToOne
    //private Endereco endereco;
    @Column(nullable = false)
    private FormaDePagamento formaDePagamento;


    public Cliente(String nome, String cpf, FormaDePagamento formaDePagamento) {
        this.nome = nome;
        this.cpf = cpf;
        this.formaDePagamento = formaDePagamento;

    }

    public void infoCliente(){
        System.out.println("Informações do Cliente");
        System.out.println("Nome Cliente: " + nome + "\nCPF: " + cpf );

    }


    public void pagamento(FormaDePagamento pagamento){
        System.out.println("Forma de Pagamento: $ "  + pagamento);
    }
}
