package aulas.vitor.aprendendojava.objectoriented.dominio;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Funcionario {
    public String nome;
    public int idade;
    public BigDecimal salario01;
    public BigDecimal salario02;
    public BigDecimal salario03;

    public void imprimirDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Primeiro salário: R$" + this.salario01);
        System.out.println("Primeiro salário: R$" + this.salario02);
        System.out.println("Primeiro salário: R$" + this.salario03);
    }

    public void mediaSalarios(){
        BigDecimal soma = salario01.add(salario02).add(salario03);

        BigDecimal media = soma.divide(new BigDecimal("3"), 2, RoundingMode.HALF_UP);

        System.out.println("Média Salarial: R$" + media);
    }
}
