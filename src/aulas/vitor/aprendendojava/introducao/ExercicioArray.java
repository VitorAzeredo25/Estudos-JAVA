package aulas.vitor.aprendendojava.introducao;

public class ExercicioArray {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        numeros[0] = 22;
        numeros[1] = 45;
        numeros[2] = 72;
        numeros[3] = 38;
        numeros[4] = 11;

        for(int i : numeros){
            System.out.println(i);
        }


    }
}
