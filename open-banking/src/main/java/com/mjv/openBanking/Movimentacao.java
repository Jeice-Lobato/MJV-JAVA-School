package com.mjv.openBanking;
//19/04/2022
import java.time.LocalDate;

public class Movimentacao {
	//classe
	private LocalDate data;
	private Double valor;
	private String cpfCnpj ;
	private String nomeCliente;
	private Boolean estornada;
	private TipoMovimentacao tipo;
	
	//retorna o valor do atributo do objeto
	public LocalDate getData() {
		return data;
	}
		
	//define um valor para um atributo do objeto
	public void setData(LocalDate data1) {
		this.data = data1;
	}
		
	public Double getValor() {
		return valor;
	}
		
	public String getCpfCnpj() {
		return cpfCnpj;
	}
		
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
		
	public String getNomeCliente() {
		return nomeCliente;
	}
		
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
		
	public Boolean getEstornada() {
		return estornada;
	}
		
	public void setEstornada(Boolean estornada) {
		this.estornada = estornada;
	}
		
	public TipoMovimentacao getTipo() {
		return tipo;
	}
		
	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}	
	
	public String toString() {
		return "Movimentacao [data=" + data + ", valor=" + valor + ", cpfCnpj=" + cpfCnpj + ", nomeCliente="
				+ nomeCliente + ", estornada=" + estornada + ", tipo=" + tipo + "]";
	}

	//java beans - getters e setters
}