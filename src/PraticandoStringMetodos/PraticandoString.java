package PraticandoStringMetodos;
//Autora: Jeice Lobato / 16/04/2022
public class PraticandoString {
public static void main(String[] args) {
	//String e M�todos e Socrecarga.
	
	String frase = "EuAmoJava";
	// M�todo Length utilizado para retornar o n�mero de caracteres.
	int nome = frase.length();
	
	// M�todo toUppweCase utilizado para retornar os caracteres em formato mai�sculo.
	String nome1 = frase.toUpperCase();
	
	// M�todo toLowerCase utilizado para retornar os caracteres em formato min�sculo.
	String nome2 = frase.toLowerCase();
	
	// M�todo concat utilizado para retornar as palavras concatenadas.
	String nome3 = frase.concat(" <---> " + frase);
	
	System.out.println(nome);
	System.out.println(nome1);
	System.out.println(nome2);
	System.out.println(nome3);
	
   // Exemplo de Sobrecarga: Quando os m�todos s�o iguais e os par�metros diferentes.
	// O M�todo substring retorna com o caractere indicado no �ndice escolhido. O �ltimo �ndice n�o retorna o �ltimo caractere indicado, sempre o pen�ltimo.
	String nomeMinhaCa�ula = "Aim�e";
    System.out.println(nomeMinhaCa�ula.substring(1));
    System.out.println(nomeMinhaCa�ula.substring(2,4));
	
  }
}