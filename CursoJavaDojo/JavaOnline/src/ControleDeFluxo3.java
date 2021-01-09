/***
 * Dado os dias de 1 a 7, imprima o dia da semana equivalente
 */

public class ControleDeFluxo3 {
    public static void main(String[] args) {
        int dia = 7;
        String diaSemana;

        switch (dia) {
            case 1:
                diaSemana = "domingo";
                break;
            case 2:
                diaSemana = "segunda";
                break;
            case 3:
                diaSemana = "terca";
                break;
            case 4:
                diaSemana = "quarta";
                break;
            case 5:
                diaSemana = "quinta";
                break;
            case 6:
                diaSemana = "sexta";
                break;
            case 7:
                diaSemana = "sabado";
                break;
            default:
                diaSemana = "dia invalido";
                break;
        }

        System.out.println(diaSemana);

        String sexo = "F";

        switch (sexo) {
            case "F":
                System.out.println("Feminino");
                break;
            case "M":
                System.out.println("Masculino");
                break;
            default:
                System.out.println("Sexo invalido");
                break;
        }
    }
}
