package javaexplorer.fundamentos;

//25/04/2022
public class StringExplorer {
	public static void main(String[] args) {
		StringExplorer.explorandoMetodoSplit();
	}

//O split separa as palavras de uma string, remove caracteres especiais.
	static void explorandoMetodoSplit() {
	String nomeCompleto = "Jeice Lobato de";
	String [] palavras = nomeCompleto.split(" ");
	//como percorrer um array
	for(String palavra : palavras) {
	System.out.println(palavra);
   
	/*
	 * Simulando a utilização do split no contexto de um ticket de passagem aerea.
	 * 
	 */
	 String lastname = palavras[2];
	//Podemos usar o método Length para excluir um array. Ex: String lastname = palavras[palavras.length -1];
	 String firstname = palavras[0];
	 System.out.println(lastname.concat(" ").concat(firstname));
  }
  
	}

}