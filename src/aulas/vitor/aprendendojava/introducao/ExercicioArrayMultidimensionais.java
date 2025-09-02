package aulas.vitor.aprendendojava.introducao;

public class ExercicioArrayMultidimensionais {
    public static void main(String[] args) {

        int[][] notas = {
                {10, 8, 9},  // Aluno 1
                {7, 8, 7},   // Aluno 2
                {5, 4, 7}    // Aluno 3
        };

        for (int numAluno = 0; numAluno < notas.length; numAluno++) {
            int soma = 0;
            System.out.print("Notas do Aluno " + (numAluno + 1) + ": ");

            for (int notasAlunos = 0; notasAlunos < notas[numAluno].length; notasAlunos++) {
                int nota = notas[numAluno][notasAlunos];
                soma += nota;
                System.out.print(nota + " ");
            }

            double media = (double) soma / notas[numAluno].length;
            System.out.printf("- Média: %.2f%n", media);
        }
    }
}
