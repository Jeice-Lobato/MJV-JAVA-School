package modelo;
//Autora: Jeice Lobato
// 19/04/2022
public class Pessoa {
	
	//Treinando alguns exemplos dos métodos Getters e Setters, construtor, modelo.
	

	private String nome;
	private String cpf;
	private String endereco;

	public Pessoa(String nome, String cpf, String endereco) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;

	}
	
	public Pessoa() {
		
	}


	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome1) {
	    this.nome = nome1;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
}
