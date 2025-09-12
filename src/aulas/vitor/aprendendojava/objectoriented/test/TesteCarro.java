package aulas.vitor.aprendendojava.objectoriented.test;

import aulas.vitor.aprendendojava.objectoriented.dominio.Carro;

import java.math.BigDecimal;

public class TesteCarro {
    public static void main(String[] args) {

        Carro carro01 = new Carro();
        carro01.nome = "VW Gol";
        carro01.ano = 2013;
        carro01.valor = new BigDecimal("33954.35");

        Carro carro02 = new Carro();
        carro02.nome = "VW Polo";
        carro02.ano = 2024;
        carro02.valor = new BigDecimal("99300.00");

        System.out.println(carro01.nome + " " + carro01.ano + " " + "R$" + carro01.valor);
        System.out.println(carro02.nome + " " + carro02.ano + " " + "R$" + carro02.valor);
    }
}
