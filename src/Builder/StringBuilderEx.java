package Builder;

public class StringBuilderEx {
	public static void main(String[] args) {
		StringBuilder frase = new StringBuilder ("Eu");
	    //Quando alteramos um valor de um objeto da classe String automaticamente � criado um novo objeto.
        // Utilizando a Classe StringBuilder isso n�o acontece, pois os seus valores s�o mut�veis.
		System.out.println(frase);
		//para que possamos adicionar caracteres dentro da vari�vel frase utilizamos o m�todo append, ele concatena ou adiciona valores a String criada
		frase.append("Amo");
		System.out.println(frase);
		//tamb�m � poss�vel concatenar vari�veis utilizando esse m�todo
		StringBuilder fraseUltima = new StringBuilder (frase);
		fraseUltima.append("Voc�");
		System.out.println(fraseUltima);
	}

}
