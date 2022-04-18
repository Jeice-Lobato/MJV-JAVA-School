package PraticandoStringMetodos;

public class PraticandoString {
public static void main(String[] args) {
	//String e Métodos.
	
	String frase = "EuAmoJava";
	
	int nome = frase.length();
	String nome1 = frase.toUpperCase();
	String nome2 = frase.toLowerCase();
	String nome3 = frase.concat("Simplesmente" + frase);
	
	System.out.println(nome);
	System.out.println(nome1);
	System.out.println(nome2);
	System.out.println(nome3);
	
	
  }
}