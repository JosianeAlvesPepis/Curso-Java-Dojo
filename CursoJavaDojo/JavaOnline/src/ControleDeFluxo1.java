/***
 * idade < 12 categoria infantil
 * idade >= 12 && idade < 18 categoria juvenil
 * idade >= 18 categoria adulto
 */

public class ControleDeFluxo1 {
    public static void main(String[] args) {

        int idade = 17;
        String categoria;

        if(idade < 12){
            categoria = "Infantil";
        }else if(idade >= 12 && idade < 18){
            categoria = "Juvenil";
        }else{
            categoria = "Adulto";
        }

        System.out.printf(categoria);
    }
}
