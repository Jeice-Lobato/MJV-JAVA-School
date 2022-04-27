package controle.de.fluxos;
//26/04/2022
public class ControleFluxoRepeticao {
	public static void main(String[] args) {
		exemploBreakContinue();
	}
	
	static void exemploBreakContinue() {
		for(int x = 1; x <= 5; x++) {
			if(x==3) {
				//break; Quando quero interromper a opera��o
				continue; //Quando quero que a opera��o continue
			}
			System.out.println(x);
		}
	}

}
/*
 *  Resultado no console Break : 1 2 (Parou no 3, pelo break interromper quando x==3)
 */								

/*
 * Resultado no console Continue : 1 2 4 5 (A opera��o continuou, mas n�o imprimiu o 3, pela condi��o de x==3)
 */

