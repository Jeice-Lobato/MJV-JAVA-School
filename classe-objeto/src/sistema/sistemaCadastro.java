package sistema;
//Autora: Jeice Lobato
// 19/04/2022
import modelo.Pessoa;

public class sistemaCadastro {
	public static void main(String[] args) {
		//Treinando alguns exemplos dos métodos Getters e Setters, construtor, modelo.
		//OBS: Get retorna, Set atribúi. Toda vez que usar o Set, usar o Get para imprimir o resultado na tela.
		
		
	//	Pessoa jeice = new Pessoa("jeice", "896745896", "rua maria");
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		
		pessoa2.setNome("Aimée");
		pessoa2.setCpf("147859632");
		pessoa2.setEndereco("rua euclides");
		
		
		pessoa1.setNome("Mel");
		pessoa1.setCpf("15875698523");
		pessoa1.setEndereco("rua joao");
		
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getCpf());
		System.out.println(pessoa1.getEndereco());
		
		System.out.println(" ");
		System.out.println(pessoa2.getNome());
		System.out.println(pessoa2.getCpf());
		System.out.println(pessoa2.getEndereco());
		
	}

}
