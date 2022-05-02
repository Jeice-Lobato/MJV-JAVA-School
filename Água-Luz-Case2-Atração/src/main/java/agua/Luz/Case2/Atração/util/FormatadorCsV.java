package agua.Luz.Case2.Atração.util;

import java.util.List;

import agua.Luz.Case2.Atração.model.Cliente;
import agua.Luz.Case2.Atração.model.Endereco;
import agua.Luz.Case2.Atração.model.Servicos;
import service.GerandoArquivo;

// 24/04/2022
// Aluna: Jeice Lobato
// Projeto Água e Luz - Case 2 - Atração
public class FormatadorCsV {

	public static String formatador(List<Cliente> clientes) {
		// A Classe Cliente tem todas as outras classes e enums linkadas à ela. Através
		// do método get, podemos retornar a variável e alterar os caracteres, usando
		// variados métodos..

		StringBuilder sb = new StringBuilder();
		for (Cliente cli : clientes) {

			Endereco end = cli.getEndereco();
			Servicos sc = cli.getServicos();

			
			sb.append(String.format("%011d", Long.valueOf(cli.getCpf().replaceAll("\\D", "")))+";");

			sb.append(String.format("%-10s", cli.getRg())+";");

			sb.append(cli.getNome().substring(0, 30).toUpperCase()+";");

			sb.append(cli.getCelular().replaceAll("[^0-9.]", "").trim()+";");

			String logradouro = end.getLogradouro();
			if (logradouro.length() >= 19)
				sb.append(logradouro.substring(0, 19).toUpperCase()+";");
			else
				sb.append(String.format("%-20s", logradouro.toUpperCase())+";");

			sb.append(String.format("%06d", Long.valueOf(end.getNumero()))+";");

			String complemento = end.getComplemento();
			if (complemento.length() >= 10)
				sb.append(complemento.substring(0, 10).toUpperCase()+";");
			else
				sb.append(String.format("%-10s", logradouro.toUpperCase())+";");

			String bairro = end.getBairro();
			if (bairro.length() >= 15)
				sb.append(bairro.substring(0, 15).toUpperCase()+";");
			else
				sb.append(String.format("%-15s", bairro.toUpperCase())+";");

			String cidade = end.getCidade();
			if (cidade.length() >= 30)
				sb.append(cidade.substring(0, 30).toUpperCase()+";");
			else
				sb.append(String.format("%-30s", cidade.toUpperCase())+";");

			sb.append(end.getUF()+";");

			sb.append(end.getCep().replace(".", "")+";");

			sb.append(end.getisoPais().getSigla()+";");

			sb.append(String.format("%010d", Long.valueOf(sc.getProtocolo().toString().replaceAll("\\D", "")))+";");

			sb.append(sc.getData().toString().replaceAll("\\D", "")+";");

			sb.append(sc.getHora().toString().replaceAll("\\D", "")+";");

			sb.append(sc.getTipoServico().getSigla()+";");

			sb.append(String.valueOf(sc.getValorServico()).replaceAll("\\D", "")+";");

			sb.append(sc.getTipoNotificacao().getSigla()+";");

			sb.append("\n");

		}
		return sb.toString();
	}
	}
