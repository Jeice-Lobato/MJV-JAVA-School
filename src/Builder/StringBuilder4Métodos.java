package Builder;

public class StringBuilder4M�todos {
public static void main(String[] args) {
	String s = "Viva a vida ";
	StringBuilder sb = new StringBuilder();
	
	// M�todo append para concatenar "Strings" no StringBuilder.
	sb.append("Viva a vida");
	sb.append(" Sempre!");
	
	// M�todo to.String utilizado para retornar a String no StringBuilder.
	s = sb.toString();
	
	System.out.println(s);
	
	// M�todo insert utilizado para inserir caracteres na posi��o indicada.
	System.out.println(sb.insert(4, " LA "));
	
	// M�todo delete utilizado para deletar caracteres nas posi��es indicadas.
	System.out.println(sb.delete(4,8));
	
	// M�todo reverse utilizado para inverter os caracteres.
	System.out.println(sb.reverse());
	
	
  }
}
