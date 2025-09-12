package aulas.vitor.aprendendojava.objectoriented.test;

import aulas.vitor.aprendendojava.objectoriented.dominio.Estudante;

public class TesteEstudante {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Vítor";
        estudante01.idade = 22;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria";
        estudante02.idade = 15;
        estudante02.sexo = 'F';


        estudante01.imprime();
        estudante02.imprime();
    }
}
