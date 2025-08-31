package aulas.vitor.aprendendojava.introducao;

public class ExercicioArray {
    public static void main(String[] args) {
        int[] numeros_listados = new int[5];
        numeros_listados[0] = 22;
        numeros_listados[1] = 45;
        numeros_listados[2] = 72;
        numeros_listados[3] = 38;
        numeros_listados[4] = 11;

        for(int i : numeros_listados){
            System.out.println(i);
        }


    }
}
