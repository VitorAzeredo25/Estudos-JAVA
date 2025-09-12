package aulas.vitor.aprendendojava.objectoriented.dominio;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcionario {
    public String nome;
    public int idade;
    public BigDecimal[] salarios;

    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if (salarios != null) {
            for (BigDecimal salario : salarios) {
                System.out.println("Primeiro salário: R$" + salario);
            }
        } else {
            System.out.println("Sem salários para mostrar...");
        }
    }

    BigDecimal soma = BigDecimal.ZERO;

    public void mediaSalarios() {
        if(salarios != null) {
            for (BigDecimal valores : salarios) {
                soma = soma.add(valores);
            }

            BigDecimal media = soma.divide(new BigDecimal("3"), 2, RoundingMode.HALF_UP);

            System.out.println("Média Salarial: R$" + media);
        } else {
            System.out.println("Sem salários para fazer a média...");
        }
    }
}
