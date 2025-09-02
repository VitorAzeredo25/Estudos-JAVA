package aulas.vitor.aprendendojava.introducao;

public class ExercicioArrayMultidimensionais {
    public static void main(String[] args) {

        int[][] notas = {
                {10, 8, 9},  // Aluno 1
                {7, 8, 7},   // Aluno 2
                {5, 4, 7}    // Aluno 3
        };

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Notas do Aluno " + (i + 1) + ": ");
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < notas.length; i++) {
            int soma = 0;
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j]; // soma as notas do aluno
            }
            double media = (double) soma / notas[i].length;
            System.out.printf("Média de notas do Aluno %d: %.2f%n", (i + 1), media);
        }
    }
}
