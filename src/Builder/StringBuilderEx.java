package Builder;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder frase = new StringBuilder ("Eu");
	    //Quando alteramos um valor de um objeto da classe String automaticamente é criado um novo objeto.
        // Utilizando a Classe StringBuilder isso não acontece, pois os seus valores são mutáveis.
		System.out.println(frase);
		//para que possamos adicionar caracteres dentro da variável frase utilizamos o método append, ele concatena ou adiciona valores a String criada
		frase.append("Amo");
		System.out.println(frase);
		//também é possível concatenar variáveis utilizando esse método
		StringBuilder fraseUltima = new StringBuilder (frase);
		fraseUltima.append("Você");
		System.out.println(fraseUltima);
	}

}
