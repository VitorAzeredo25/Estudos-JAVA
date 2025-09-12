package aulas.vitor.aprendendojava.objectoriented.test;

import aulas.vitor.aprendendojava.objectoriented.dominio.Funcionario;

import java.math.BigDecimal;

public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Vítor";
        funcionario01.idade = 22;
        funcionario01.salarios = new BigDecimal[]{
                new BigDecimal("3000.00"),
                new BigDecimal("4000.00"),
                new BigDecimal("6000.00")
        };

        funcionario01.imprimirDados();
        funcionario01.mediaSalarios();

    }
}
