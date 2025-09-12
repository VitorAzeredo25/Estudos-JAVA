package aulas.vitor.aprendendojava.objectoriented.dominio;

public class Calculadora {

    public void somarDados(int num1, int num2) {
        System.out.println(num1 + num2);
    }

    public void subtrairDados(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public void multiplicarDados(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double dividirDados(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não posso dividir por 0");
            return 0;
        }

        return num1 / num2;
    }
}
