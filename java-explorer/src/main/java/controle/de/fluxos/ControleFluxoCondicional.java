package controle.de.fluxos;

public class ControleFluxoCondicional {
	public static void main(String[] args) {
		//ControleFluxoCondicional.simuladorCaixaEletronicoFluxoSimples(25.0, 17.0);
		simuladorCaixaEletronicoFluxoComposto(7);
		simuladorCaixaEletronicoFluxoComposto(5); //Aqui, estamos chamando o método para atribuir as variáveis no segundo exemplo.

	}

	static void simuladorCaixaEletronicoFluxoSimples(double saldo, double valorSolicitado) {
		// double saldo = 25.0; (Posso declarar o tipo e variável nos parâmetros e
		// atribuir nos parâmetros do método.
		// double valorSolicitado = 17.0;
		// foco do exemplo
		if (valorSolicitado < saldo) {
			saldo = saldo - valorSolicitado;
		}
		// perfumando(comentar)
		System.out.println(saldo);
		System.out.println("fim");
	}

	static void simuladorCaixaEletronicoFluxoComposto(double nota) {
		// foco do exemplo

		if (nota >= 7) {
			System.out.println("Aprovado");

		}else
			System.out.println("Reprovado");
		System.out.println("fim");
	}
	 
}