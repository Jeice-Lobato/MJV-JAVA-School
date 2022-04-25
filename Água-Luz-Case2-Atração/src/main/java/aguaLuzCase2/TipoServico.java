package aguaLuzCase2;
// 24/04/2022
// Aluna: Jeice Lobato
// Projeto Água e Luz - Case 2 - Atração
public enum TipoServico {
	
	AGUA("A", "R$ 137,21"),
	LUZ("L", "R$ 132,15");
	
	

	private String sigla;
	private String valor;
	private TipoServico  (String sigla, String valor) {
		this.sigla = sigla;	
		this.valor = valor;
	}
	
	public String getSigla() {
		return sigla;	
	}
	
	public String getValor() {
		return valor;
	}
}
