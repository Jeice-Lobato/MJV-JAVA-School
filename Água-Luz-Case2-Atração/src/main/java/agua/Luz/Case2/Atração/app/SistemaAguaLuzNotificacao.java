package agua.Luz.Case2.Atração.app;
// Aluna: Jeice Lobato
import java.util.List;

import agua.Luz.Case2.Atração.model.Cliente;
import service.GeradorMensagem;
import service.LeitorArquivo;

public class SistemaAguaLuzNotificacao {
	public static void main(String[] args) {
		LeitorArquivo la = new LeitorArquivo();

		List<Cliente> clientesVindoCsv = la.lerClientesCsV();

		GeradorMensagem gm = new GeradorMensagem();
		for (Cliente cli : clientesVindoCsv) {
			gm.gerar(cli);
	 }

	}

}
