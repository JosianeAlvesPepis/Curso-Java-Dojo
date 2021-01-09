/***
 * Crie um switch que dado um valor de 1 a 7,
 * considerando 1 como domingo,
 * imprima se é dia útil ou final de semana.
 */

public class ExecicioControleFluxo2 {
    public static void main(String[] args) {
        int dia = 7;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("dia invalido");
                break;
        }

    }
}
