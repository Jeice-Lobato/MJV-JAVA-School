package agua.Luz.Case2.Atração.app;

import java.util.List;

import agua.Luz.Case2.Atração.model.Cliente;
import agua.Luz.Case2.Atração.repository.ClienteRepository;
import service.GerandoArquivo;

public class SistemaAguaLuzAtracao {
	public static void main(String[] args) {
		
		ClienteRepository cr = new ClienteRepository();
		List<Cliente> clientes = cr.listar();
		
		GerandoArquivo ga = new GerandoArquivo();
		
		ga.GeraCsvUsandoFormatador(clientes);
		ga.GeraTxtUsandoFormatador(clientes);
	
	 }

}
