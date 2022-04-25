package aguaLuzCase2;

import java.util.List;

public class GeradorArquivo {

	public static void main(String[] args) {

		Servicos sc = new Servicos();

		sc.setProtocolo("1984365");
		sc.setValorServico(127.35);
		sc.setDataAgendada("07/05/2022");
		sc.setHoraAgendada("15:21");
		sc.setTipoServico(TipoServico.AGUA);
		sc.setTipoNotificacao(TipoNotificacao.WHATSApp);

		Endereco end = new Endereco();
		end.setBairro("São Sebastião");
		end.setCep("07.210.715");
		end.setCidade("São Raimundo Nonato");
		end.setComplemento("AP 210 BL CENTAURO");
		end.setLogradouro("Rua Sebastião Firmino");
		end.setNumero("123");
		end.setUF("SP");
		end.setisoPais(Paises.BRASIL);

		Cliente cli = new Cliente();

		cli.setNome("Raimundo Nonato Loureiro Castelo Branco");
		cli.setCpf("007.324.223.21");
		cli.setRg("337655");
		cli.setCelular("(11) 99768-1515");
		cli.setEndereco(end);
		cli.setServicos(sc);
		System.out.println(formatador(cli));
	}

	public static String formatador(Cliente cliente) {




		StringBuilder sb = new StringBuilder();


		sb.append(cliente.getCpf().replace(".", "") + ";");

		sb.append(String.format("%10s", (cliente.getRg().replaceAll("-", ""))) + ";");

		sb.append(cliente.getNome().substring(0, 30).toUpperCase() + ";");

		sb.append(cliente.getCelular().replaceAll("[^0-9.]", "").trim() + ";");

		String logradouro = cliente.getEndereco().getLogradouro();
		if (logradouro.length() >= 19)
			sb.append(logradouro.substring(0, 19).toUpperCase() + ";");
		else
			sb.append(String.format("%-20s", logradouro.toUpperCase()) + ";");

		sb.append("000" + cliente.getEndereco().getNumero() + ";");

		String complemento = cliente.getEndereco().getComplemento();
		if (complemento.length() >= 10)
			sb.append(complemento.substring(0, 10).toUpperCase() + ";");
		else
			sb.append(String.format("%-10s", logradouro.toUpperCase()) + ";");

		String bairro = cliente.getEndereco().getBairro();
		if (bairro.length() >= 15)
			sb.append(bairro.substring(0, 15).toUpperCase() + ";");
		else
			sb.append(String.format("%-15s", bairro.toUpperCase()) + ";");

		String cidade = cliente.getEndereco().getCidade();
		if (cidade.length() >= 30)
			sb.append(cidade.substring(0, 30).toUpperCase() + ";");
		else
			sb.append(String.format("%-30s", cidade.toUpperCase()) + ";");

		String uf = cliente.getEndereco().getUF();
		if (uf.length() >= 2)
			sb.append(uf.substring(0, 2).toUpperCase() + ";");
		else
			sb.append(String.format("%-2s", uf.toUpperCase()) + ";");

		sb.append(cliente.getEndereco().getCep().replace(".", "") + ";");
		
		sb.append(cliente.getEndereco().getisoPais().getSigla() + ";");
		
		sb.append("000" + cliente.getServicos().getProtocolo() + ";");
		
		sb.append(cliente.getServicos().getDataAgendada().toString().replaceAll("\\D", "") + ";");
		
		sb.append(cliente.getServicos().getHoraAgendada().toString().replaceAll("\\D", "") + ";");
		
		sb.append(cliente.getServicos().getTipoServico().getSigla() + ";");
		
		sb.append(String.valueOf(cliente.getServicos().getValorServico()).replaceAll("\\D", "") + ";");
		
		sb.append(cliente.getServicos().getTipoNotificacao().getSigla());

		return sb.toString();

	}

}
