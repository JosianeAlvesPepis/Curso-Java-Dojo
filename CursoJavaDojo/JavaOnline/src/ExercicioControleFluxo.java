/***
 * Crie uma variavel salario e imprima seu imposto:
 * salario < 1000 5%
 * salario >= 1000 && salario < 2000 10%
 * salario >= 2000 && salario < 4000 15%
 * salario >= 4000 20%
 */

public class ExercicioControleFluxo {
    public static void main(String[] args) {
        double salario = 3000;
        double imposto;

        if(salario < 1000){
            imposto = salario * 1.05;
        }else if(salario >= 1000 && salario < 2000){
            imposto = salario * 1.1;
        }else if(salario >= 2000 && salario < 4000){
            imposto = salario * 1.15;
        }else{
            imposto = salario * 1.2;
        }

        System.out.println(imposto);
    }
}
