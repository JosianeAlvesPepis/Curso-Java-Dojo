public class ControleDeFluxo4 {
    public static void main(String[] args) {
        int contador = 0;

        while(contador < 10){
            System.out.println(contador);
            contador++;
        }

        do{
            System.out.println("Entrou no do");
        }while(contador < 10);

        for(contador = 0; contador < 10; contador++) {
            System.out.println(contador);
        }
    }
}
