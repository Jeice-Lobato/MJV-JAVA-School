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
			System.out.println("Multa Gravíssima");

		} else {
			System.out.println("Você está dentro da velocidade e não foi multado!");
		}

	}
}

/*
 *  Resultado no console:
 *  
 *  Multa Gravíssima
	Você está dentro da velocidade e não foi multado!
	Multa Leve
	Multa Grave

 */


