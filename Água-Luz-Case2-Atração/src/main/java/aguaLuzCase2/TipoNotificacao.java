package aguaLuzCase2;
// 24/04/2022
// Aluna: Jeice Lobato
// Projeto �gua e Luz - Case 2 - Atra��o
public enum TipoNotificacao {

	SMS("S"), 
	WHATSApp("W");

	private String sigla;

	private TipoNotificacao(String sigla) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

}
