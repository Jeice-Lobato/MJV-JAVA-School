package Builder;

public class StringBuilder4Métodos {
public static void main(String[] args) {
	String s = "Viva a vida ";
	StringBuilder sb = new StringBuilder();
	
	// Método append para concatenar "Strings" no StringBuilder.
	sb.append("Viva a vida");
	sb.append(" Sempre!");
	
	// Método to.String utilizado para retornar a String no StringBuilder.
	s = sb.toString();
	
	System.out.println(s);
	
	// Método insert utilizado para inserir caracteres na posição indicada.
	System.out.println(sb.insert(4, " LA "));
	
	// Método delete utilizado para deletar caracteres nas posições indicadas.
	System.out.println(sb.delete(4,8));
	
	// Método reverse utilizado para inverter os caracteres.
	System.out.println(sb.reverse());
	
	
  }
}
