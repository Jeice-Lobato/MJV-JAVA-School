package controle.de.fluxos;
import java.util.concurrent.ThreadLocalRandom;
//26/04/2022
public class ControleFluxosRepeticaoWhile {

public static void main(String[] args) {
	double mesada = 50.0;
        while(mesada>0) {
            Double valorDoce = valorAleatorio();
            if(valorDoce > mesada) // Condi��o somente para que o valor n�o d� negativo.
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
            mesada = mesada - valorDoce;
        }
        System.out.println("Mesada:" + mesada);
        System.out.println("Jo�ozinho gastou toda a sua mesada em doces");
        
        /*
        * N�o se preocupe quanto a formata��o de valores
        * Iremos explorar os recursos de formata��o em breve !!
        */
   }
   private static double valorAleatorio() {
	return ThreadLocalRandom.current().nextDouble(4, 8); //Valores atribu�dos ao valorDoce.
   }
}
