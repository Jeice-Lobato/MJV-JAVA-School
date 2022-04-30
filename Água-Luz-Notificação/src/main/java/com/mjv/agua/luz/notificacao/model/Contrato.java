package com.mjv.agua.luz.notificacao.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Contrato {
	
	private Long protocolo;
	private String tipoServico;
	private Double valorServico;
	private Cadastro cliente;
	private LocalDate data = LocalDate.of(2022,2,21);
	private LocalTime hora = LocalTime.of(16,0);
	
	
	public Long getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(Long protocolo) {
		this.protocolo = protocolo;
	}
	public String getTipoServico() {
		return tipoServico;
	}
	public void setTipoServico(String tipoServico) {
		this.tipoServico = tipoServico;
	}
	public Double getValorServico() {
		return valorServico;
	}
	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}
	
	public Cadastro getCliente() {
		return cliente;
	}
	
	public void setCliente(Cadastro cliente) {
		this.cliente = cliente;
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	
	
}
