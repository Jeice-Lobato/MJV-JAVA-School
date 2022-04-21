package com.mjv.openBanking;
//19/04/2022
public enum TipoMovimentacao {
	RECEITA ("R") ,
	DESPESA ("D");
	
	private String sigla;
	private TipoMovimentacao (String sigla) {
		this.sigla = sigla;
	}
	public String getSigla() {
		return sigla;
	}
}