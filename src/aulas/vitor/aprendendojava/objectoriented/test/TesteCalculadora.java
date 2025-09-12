package aulas.vitor.aprendendojava.objectoriented.test;

import aulas.vitor.aprendendojava.objectoriented.dominio.Calculadora;

public class TesteCalculadora {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();
        calculadora.somarDados(10, 20);
        calculadora.subtrairDados(100,59);
        calculadora.multiplicarDados(7,7);
        double result = calculadora.dividirDados(22,0);
        System.out.println(result);
    }
}
