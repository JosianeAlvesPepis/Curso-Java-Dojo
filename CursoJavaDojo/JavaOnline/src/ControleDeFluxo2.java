/***
 * Operador ternário
 * ? <true> : <false>
 */

public class ControleDeFluxo2 {
    public static void main(String[] args) {
        int idade = 30;
        String status;

        if (idade < 18) {
            status = "Infantojuvenil";
        } else {
            status = "Adulto";
        }

        status = idade < 18 ? "Infantojuvenil" : "Adulto";

        System.out.println(status);
    }
}
