package service;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import agua.Luz.Case2.Atração.model.Cliente;
import agua.Luz.Case2.Atração.util.FormatadorCsV;
import agua.Luz.Case2.Atração.util.FormatadorTxt;

public class GerandoArquivo {

	public void GeraCsvUsandoFormatador(List<Cliente> cli) {

		StringBuilder sb = new StringBuilder();
		
		escrever1(FormatadorCsV.formatador(cli), "agua-luz-contratos.csv");
			
		}
		
		private void escrever1(String conteudo, String nomeArquivo) {

		File dir = new File("/mjv-java-school/agua-luz-output");
		if (!dir.exists());
			dir.mkdir();

		Path path = Paths.get(dir.getAbsolutePath(), nomeArquivo);

		// string -> bytes
		try {
			Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	

	public void GeraTxtUsandoFormatador(List<Cliente> cli) {

		StringBuilder sb = new StringBuilder();

		escrever(FormatadorTxt.formatador(cli), "agua-luz-contratos.txt");
	}

	private void escrever(String conteudo, String nomeArquivo) {
		File dir = new File("/mjv-java-school/agua-luz-output");
		dir.mkdir();

		Path path = Paths.get(dir.getAbsolutePath(), nomeArquivo);

		// string -> bytes
		try {
			Files.write(path, conteudo.getBytes(StandardCharsets.UTF_8));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
