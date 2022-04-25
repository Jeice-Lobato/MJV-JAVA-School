package aguaLuzCase2;
// 24/04/2022
// Aluna: Jeice Lobato
// Projeto Água e Luz - Case 2 - Atração
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
