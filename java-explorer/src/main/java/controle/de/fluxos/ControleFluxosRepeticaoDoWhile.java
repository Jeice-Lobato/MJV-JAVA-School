package controle.de.fluxos;
import java.util.Random;
//27/04/2022
public class ControleFluxosRepeticaoDoWhile {

		public static void main(String[] args) {
			
			System.out.println("Discando...");
			
			do {
				//excutando repetidas vezes até alguém atender
				System.out.println("Telefone tocando...");
			
			}while(tocando());
			
			System.out.println("Alô !!!");
		}
		private static boolean tocando() {
			boolean atendeu = new Random().nextInt(3)==1;
			System.out.println("Atendeu? " + atendeu);
			//negando o ato de continuar tocando
			return ! atendeu;
		}
}
