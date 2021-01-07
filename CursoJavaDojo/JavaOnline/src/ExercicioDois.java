/***
 * Crie um algoritimo que possua variaveis nome, salario, sexo (M ou F), idade, estado civil
 *
 * Imprima da seguinte forma:
 *
 * "O trabalhador(a) <nome> do sexo <sexo>, idade <idade>, estado civil <estado civil> e salario <salario> encontra-se
 * empregado neste estabelecimento."
 *
 */


public class ExercicioDois {
    public static void main(String[] args){
        String nome = "Josiane Pepis";
        double salario = 15000;
        String sexo = "F";
        int idade = 30;
        String estadoCivil = "casada";

        System.out.println("O trabalhador(a) "+nome+" do sexo "+sexo+", idade "+idade+", estado civil "+estadoCivil+
                " e salario "+salario+" encontra-se empregado neste estabelecimento.");
    }
}
