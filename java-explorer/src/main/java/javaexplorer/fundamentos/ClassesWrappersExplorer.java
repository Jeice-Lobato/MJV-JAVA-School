package javaexplorer.fundamentos;
//25/04/2022
public class ClassesWrappersExplorer {
	public static void main(String[] args) {
		
		ClassesWrappersExplorer.converterStringEmNumeros();
		// Chamando o m�todo.		
	}// M�todo Static n�o exige uma cria��o de um objeto. Executa o m�todo sem precisar instanciar uma classe.
	static void converterStringEmNumeros() {
		//convertendo uma String em Integer;
		Integer numero = Integer.valueOf("123");
		
		//Convertendo uma string em double
		Double numeroDuplo = Double.valueOf("123.45");
		
		System.out.println(numero);
		System.out.println(numeroDuplo);
	}
}
