package aulas.vitor.aprendendojava.introducao;

public class ExercicioBreak {
    public static void main(String[] args) {
        double valorDoCarro = 50000;

        for (int parcela = 1; parcela <= valorDoCarro; parcela++) {
            double valorParcela = valorDoCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$"+valorParcela);
        }
    }
}
