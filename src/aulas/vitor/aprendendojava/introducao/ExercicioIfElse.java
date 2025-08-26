package aulas.vitor.aprendendojava.introducao;

public class ExercicioIfElse {
    public static void main(String[] args) {
        // Resolver quando eu aprender, o problema de usar Double para dinheiro!
        double salarioAnual = 30000;
        double taxa1 = 9.70 / 100;
        double taxa2 = 37.35 / 100;
        double taxa3 = 49.50 / 100;
        double valorAPagar;

        if (salarioAnual <= 34712){
            valorAPagar = salarioAnual * taxa1;
            System.out.println("Taxa anual de 9.70%");
            System.out.println("Valor a pagar R$" + valorAPagar);
        }
        else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorAPagar = salarioAnual * taxa2;
            System.out.println("Taxa anual de 37.35");
            System.out.println("Valor a pagar R$" + valorAPagar);
        }
        else {
            valorAPagar = salarioAnual * taxa3;
            System.out.println("Taxa anual de 49.50");
            System.out.println("Valor a pagar R$" + valorAPagar);
        }
    }
}
