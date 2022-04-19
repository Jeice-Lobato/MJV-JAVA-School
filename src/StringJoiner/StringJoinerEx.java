package StringJoiner;
//Autora: Jeice Lobato  17/04/2022
import java.util.StringJoiner;
public class StringJoinerEx {  
	
	// M�todo String.join utilizado como delimitador para retornar os caracteres com o delimitador inserido.
    public static void main(String[] args) {          
        String date = String.join("/","18","04","2022");    
        System.out.println(date);    
        String tempo = String.join(":", "18","30","10");
        System.out.println(" "+tempo);
        
        String frase1 = String.join(" ", "- Ol�","turma","MJVSchool =) ");  
        System.out.println(" ");
        System.out.println(frase1);  
        
     
        String str = null;  
      
        // Um dos elementos � nulo, portante ser� tratado como String normal. 
         // Exemplo de Sobrecarga: Quando os m�todos s�o iguais e os par�metros diferentes.
        str = String.join(",", null, " Acorda ", " Coma ", " Estude Java ", " Coma ", " Durma "); 
        str = String.join(",", null, " Acorda", " Seja grato por mais um dia", " Se alimente", " Estude e trabalhe", " Se exercite", " Pratique um Hobbie", " Tenha di�logos saud�veis", " Tenha uma boa noite de sono. "); 
        System.out.println(" ");
        System.out.println(str);  

        
        // Exemplo de Sobrecarga: Quando os m�todos s�o iguais e os par�metros diferentes.
        String dataM�s = String.join("/", "18", "04");
        String dataM�sAno = String.join("/", "18", "04", "2022");
        System.out.println(" ");
        System.out.println(" " +dataM�s);
        
        
        // Instanciando a classe StringJoiner, usando array e criando um objeto.
        String [] turma = new String [] {"Projeto", "M�sica"};
        String listaTurma = String.join("-", turma);
        System.out.println(listaTurma);
        
        // Autor: Isa�as
       // Exemplo do Isa�as instanciando a classe StringJoiner, criando um novo objeto, utilizando o m�todo add, para concatenar os caracteres dentro da String.
        StringJoiner banda = new StringJoiner(" ","Rock - "," /SP - Santos");

        //System.out.println(banda);
        banda.toString();
        banda.add("Charlie");
        banda.add("Brown");
        banda.add("Junior");
        System.out.println(" ");
        System.out.println(banda);
        
      
        

	}
}
