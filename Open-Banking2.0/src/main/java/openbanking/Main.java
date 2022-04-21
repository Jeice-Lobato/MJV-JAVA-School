package openbanking;
//21/04/2022
import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		
		Movimentacao movimentacao2 = new Movimentacao(LocalDate.now(), 1275.48, TipoMovimentacao.RECEITA, true );
	    
		
		Cliente jeice = new Cliente("Jeice", "785964526", movimentacao2);
		
		System.out.println(jeice.toString());
	}

}
