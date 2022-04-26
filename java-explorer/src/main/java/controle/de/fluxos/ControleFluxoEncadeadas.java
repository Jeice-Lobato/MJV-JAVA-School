package controle.de.fluxos;

public class ControleFluxoEncadeadas {
	public static void main(String[] args) {
		ControleFluxoEncadeadas.simuladorMulta(100);
		simuladorMulta(50);
		simuladorMulta(75);
		simuladorMulta(85);
	}

	static void simuladorMulta(int velocarA) {

		if (velocarA >= 60 && velocarA < 80) {
			System.out.println("Multa Leve");

		} else if (velocarA >= 80 && velocarA < 100) {
			System.out.println("Multa Grave");

		} else if (velocarA >= 100) {
			System.out.println("Multa Grav�ssima");

		} else {
			System.out.println("Voc� est� dentro da velocidade e n�o foi multado!");
		}

	}
}

/*
 *  Resultado no console:
 *  
 *  Multa Grav�ssima
	Voc� est� dentro da velocidade e n�o foi multado!
	Multa Leve
	Multa Grave

 */


