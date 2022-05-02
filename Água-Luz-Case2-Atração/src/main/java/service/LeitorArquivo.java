package service;
//Aluna: Jeice Lobato
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import agua.Luz.Case2.Atração.model.Cliente;
import agua.Luz.Case2.Atração.model.Endereco;
import agua.Luz.Case2.Atração.model.Servicos;

public class LeitorArquivo {

	public List<Cliente> lerClientesCsV() {
		List<String> conteudo = ler("agua-luz-contratos.csv");
		List<Cliente> clientes = new ArrayList<Cliente>();
		for (String linha : conteudo) {

			String[] campos = linha.split(";");

			Cliente cli = new Cliente();
			cli.setCpf(campos[0]);

			clientes.add(cli);

		}

		return clientes;
	}

	private List<String> ler(String nomeArquivo) {
		Path filePath = Paths.get("/mjv-java-school/agua-luz-output", nomeArquivo);
		try {
			List<String> lines = Files.readAllLines(filePath);
			return lines;
		} catch (IOException e) {
			e.printStackTrace();
			return null;

		}

	}

}
