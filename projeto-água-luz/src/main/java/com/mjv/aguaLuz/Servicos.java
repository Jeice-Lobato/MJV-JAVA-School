package com.mjv.aguaLuz;
//23/04/2022
//Aluna: Jeice Lobato
public class Servicos {
	
	private String protocolo;
	private String tipoServico;
	private Double valorServico;
	private String dataAgendada;
	private String horaAgendada;
	
	
	public String getProtocolo() {
		return this.protocolo;
	}
	
	public void setProtocolo (String protocolo) {
		this.protocolo = protocolo;
	}
	
	public String getTiposervico() {
		return this.tipoServico;
	}
	
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
    
	public Double getValorServico() {
		return this.valorServico;
	}
	
	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}
	
	public String getDataAgendada() {
		return dataAgendada;
	}

	public void setDataAgendada(String dataAgendada) {
		this.dataAgendada = dataAgendada;
	}

	public String getHoraAgendada() {
		return horaAgendada;
	}

	public void setHoraAgendada(String horaAgendada) {
		this.horaAgendada = horaAgendada;
	}
}
