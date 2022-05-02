package agua.Luz.Case2.Atração.model;
// 24/04/2022
// Aluna: Jeice Lobato
// Projeto Água e Luz - Case 2 - Atração
public enum TipoServico {
	
	AGUA("A", 137.21),
	LUZ("L",  132.15);
	
	

	private String sigla;
	private Double valor;
	private TipoServico  (String sigla, Double valor) {
		this.sigla = sigla;	
		this.valor = valor;
	}
	
	public String getSigla() {
		return sigla;	
	}
	
	public Double getValor() {
		return valor;
	}
}
