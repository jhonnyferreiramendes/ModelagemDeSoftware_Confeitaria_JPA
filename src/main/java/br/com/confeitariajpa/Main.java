package br.com.confeitariajpa;

import br.com.confeitariajpa.DAO.BoloDAO;
import br.com.confeitariajpa.DAO.ClienteDAO;
import br.com.confeitariajpa.DAO.EnderecoDAO;
import br.com.confeitariajpa.DAO.EntregaDAO;
import br.com.confeitariajpa.Persistence.JpaPersistence;
import br.com.confeitariajpa.domain.Bolo;
import br.com.confeitariajpa.domain.Cliente;
import br.com.confeitariajpa.domain.Endereco;
import br.com.confeitariajpa.domain.Entrega;
import br.com.confeitariajpa.enums.Sabor;
import br.com.confeitariajpa.enums.FormaDePagamento;

import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {




       // var boloDAO = new BoloDAO();


        /*var boloBaunilha = Bolo.builder().peso(1.8).preco(19.99).sabor(Sabor.BAUNILHA).build();
        boloBaunilha.cacucularValorBaunilha(1.8, 19.99, Sabor.BAUNILHA);
        System.out.println("Salvando no banco");
        boloDAO.saveOrUpdate(boloBaunilha);
        //boloDAO.excluir(3);
        //boloDAO.findById(5);
        //boloDAO.remover(8);*/


        /*var entregaDAO = new EntregaDAO();
        var enderecoDAO = new EnderecoDAO();
        var entrega1 = Entrega.builder().distancia(25).build();
        entrega1.caucularDistancia(entrega1.getDistancia());
        entrega1.setCidade("Cajazeiras");
        entrega1.setBairro("Esperanca");
        entrega1.setRua("Samuel Duarte");
        entrega1.setNumero("1041");
        entregaDAO.saveOrUpdate(entrega1);*/






        var entregaDAO = new EntregaDAO();
        var entrega1 = Entrega.builder().distancia(17).build();
        entrega1.setRua("Samuel Duuarte");
        entrega1.setNumero("1041");
        entrega1.setBairro("Esperança");
        entrega1.setCidade("Cajazeiras");
        entrega1.caucularDistancia(entrega1.getDistancia());




        var entrega2 = Entrega.builder().distancia(18.5).build();
        entrega2.setRua("José Pedro Quirino");
        entrega2.setNumero("214");
        entrega2.setBairro("Esperança");
        entrega2.setCidade("Cajazeiras");
        entrega2.caucularDistancia(entrega2.getDistancia());
        //entregaDAO.saveOrUpdate(entrega2);

        var clienteDAO = new ClienteDAO();
        var cliente1 = Cliente.builder().nome("Jhonny Ferreira Mendes").cpf("0848706943611").formaDePagamento(FormaDePagamento.PIX).build();
        //clienteDAO.saveOrUpdate(cliente1);

        var cliente2 = Cliente.builder().nome("Damiana Viera da Silva").cpf("8747584747114").formaDePagamento(FormaDePagamento.CARTAO).build();
        //clienteDAO.saveOrUpdate(cliente2);

        var boloDAO = new BoloDAO();
        var boloBaunilha = Bolo.builder().peso(2.9).preco(25.0).sabor(Sabor.BAUNILHA).build();
        //boloBaunilha.cacucularValorBaunilha(boloBaunilha.getPeso(), boloBaunilha.getPreco(), boloBaunilha.getSabor());
        //boloDAO.saveOrUpdate(boloBaunilha);
        boloBaunilha.setId(14L);
        boloBaunilha.setPreco(40.00);
        boloBaunilha.setPeso(3.9);
        boloDAO.saveOrUpdate(boloBaunilha);

        System.out.println("**********************************************");

        cliente1.infoCliente();
        cliente1.pagamento(FormaDePagamento.PIX);


        System.out.println("**********************************************");
        entrega1.infoEndereco();

        System.out.println("**********************************************");
        System.out.println("**********************************************");

        var boloChocolate = Bolo.builder().peso(2.5).preco(22.99).sabor(Sabor.CHOCOLATE).build();
        boloChocolate.caucularValorChocolate(boloChocolate.getPeso(), boloChocolate.getPreco(),boloChocolate.getSabor());
        entrega2.caucularDistancia(15);
        //boloDAO.remover(11);

        System.out.println("**********************************************");

        cliente2.infoCliente();
        cliente2.pagamento(FormaDePagamento.DINHEIRO);


        System.out.println("**********************************************");
        entrega2.infoEndereco();

        System.out.println("**********************************************");
        System.out.println("**********************************************");

    }
}