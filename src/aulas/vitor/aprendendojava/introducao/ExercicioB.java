package aulas.vitor.aprendendojava.introducao;

public class ExercicioB {
    public static void main(String[] args) {
        double valorDoCarro = 50000;

        for (int parcela = 1; parcela <= 1000; parcela ++) {
            double valorDaParcela = valorDoCarro / parcela;
            if (valorDaParcela < 1000) {
                break;
            }
            System.out.println("Quantidade de parcelas " + parcela + " R$" + valorDaParcela);
        }

    }
}
