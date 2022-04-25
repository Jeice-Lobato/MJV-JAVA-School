package aguaLuzCase2;
// 24/04/2022
// Aluna: Jeice Lobato
// Projeto Água e Luz - Case 2 - Atração
public enum Paises {

	BRASIL("BR", "Brasil"),
	ESTADOS_UNIDOS("US", "Estados Unidos"),
	SUICA("CH", "Suica");

	private String sigla;

	private Paises(String sigla, String sigla2) {
		this.sigla = sigla;
	}

	public String getSigla() {
		return sigla;
	}

}
