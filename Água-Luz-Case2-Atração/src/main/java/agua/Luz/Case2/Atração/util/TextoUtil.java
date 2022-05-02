package agua.Luz.Case2.Atração.util;

public class TextoUtil {
// junit
	public static void main(String[] args) {
		String palavra = "Jeice";
		String novaPalavra = completar(palavra, 10);// Completando o espaço para 10 caracteres.
				System.out.println(novaPalavra);
				
				String nome = "Raimundo Nonato Loureiro Castelo Branco";
				String nomeCortado = cortar(nome, 30);//Cortando a palavra para 30 caracteres.
				System.out.println(nomeCortado);
	}
	public static String ajustar(String textoOriginal, int tamanhoMax) {
		String textoAjustado = completar(textoOriginal, tamanhoMax);
		textoAjustado = cortar(textoOriginal, tamanhoMax);
		return textoAjustado;
	}
	
	public static String completar(String textoOriginal, int tamanhoMax) {
		// "%-10s" Mesmo método usado na formatação.
		String formato = "%-" + tamanhoMax + "s";
		String textoFormatado = String.format(formato, textoOriginal);
		return textoFormatado;
	}
	
	public static String cortar(String textoOriginal, int tamanhoMax) {
		int max = Math.min(tamanhoMax, textoOriginal.length()); //Classe Math não precisa instanciar.
		return textoOriginal.substring(0, tamanhoMax); // Poderia usar o if else;
		
	}
}
