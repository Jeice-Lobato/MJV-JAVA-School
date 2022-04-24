package com.mjv.aguaLuz;
//23/04/2022
//Aluna: Jeice Lobato
public class Cliente {
	
	private String nome ;
	private String cpfCnpj;
	private Endereco endereco;
	private Servicos servico;
	
	public String getNome() {
		return this.nome;
    }
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpfCnpj() {
		return this.cpfCnpj;
	}
	 
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Servicos getServicos() {
		return this.servico;	
	}
	
	public void setServicos (Servicos servico) {
		this.servico = servico;
	}
	
	
	
	


}
