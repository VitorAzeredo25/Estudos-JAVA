package aulas.vitor.aprendendojava.introducao;

public class ExercicioSwitch {
    public static void main(String[] args) {
        String diaSemana = "Dia útil";
        String finalD = "Final de semana";
        byte numero = 3;

        switch (numero){
            case 0:
                System.out.println(finalD);
                break;
            case 7:
                System.out.println(finalD);
                break;

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(diaSemana);
                break;
        }

    }
}
