package PraticandoStringMetodos;
//Autora: Jeice Lobato / 16/04/2022
public class PraticandoString {
public static void main(String[] args) {
	//String e Métodos e Socrecarga.
	
	String frase = "EuAmoJava";
	// Método Length utilizado para retornar o número de caracteres.
	int nome = frase.length();
	
	// Método toUppweCase utilizado para retornar os caracteres em formato maiúsculo.
	String nome1 = frase.toUpperCase();
	
	// Método toLowerCase utilizado para retornar os caracteres em formato minúsculo.
	String nome2 = frase.toLowerCase();
	
	// Método concat utilizado para retornar as palavras concatenadas.
	String nome3 = frase.concat(" <---> " + frase);
	
	System.out.println(nome);
	System.out.println(nome1);
	System.out.println(nome2);
	System.out.println(nome3);
	
   // Exemplo de Sobrecarga: Quando os métodos são iguais e os parâmetros diferentes.
	// O Método substring retorna com o caractere indicado no índice escolhido. O último índice não retorna o último caractere indicado, sempre o penúltimo.
	String nomeMinhaCaçula = "Aimée";
    System.out.println(nomeMinhaCaçula.substring(1));
    System.out.println(nomeMinhaCaçula.substring(2,4));
	
  }
}