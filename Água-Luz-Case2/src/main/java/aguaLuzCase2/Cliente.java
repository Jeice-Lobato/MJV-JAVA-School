package aguaLuzCase2;
// 24/04/2022
// Aluna: Jeice Lobato
// Projeto �gua e Luz - Case 2 - Atra��o

public class Cliente {
	//Usando uma classe Cliente para dados pessoais, usando classe servicos e endereco para linkar uma � outra.
	private String nome ;
	private String cpf;
	private String rg;
	private String celular;
	private Endereco endereco;
	private Servicos servico;
	
	public String getNome() {
		return this.nome;
    }
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	 
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	 
	public String getRg() {
		return this.rg;
	}
	
	public void setRg(String rg) {
		this.rg = rg;
	}	
	
	public String getCelular() {
		return this.celular;
	}
	
	public void setCelular(String celular) {
		this.celular = celular;
	}
 
	
	public Endereco getEndereco() {
		return this.endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public Servicos getServicos() {
		return servico;
	}

	public void setServicos(Servicos servico) {
		this.servico = servico;
	}



}


