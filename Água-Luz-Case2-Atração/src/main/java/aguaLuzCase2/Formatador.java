package aguaLuzCase2;
// 24/04/2022
// Aluna: Jeice Lobato
// Projeto Água e Luz - Case 2 - Atração
public class Formatador {

	public String formatador(Cliente cliente) {
		// A Classe Cliente tem todas as outras classes e enums linkadas à ela. Através
		// do método get, podemos retornar a variável e alterar os caracteres, usando
		// variados métodos..

		StringBuilder sb = new StringBuilder();
		
		
		sb.append(cliente.getCpf().replace(".", "") + ";");

		sb.append(String.format("%-10s", (cliente.getRg().replaceAll("-", ""))) + ";");

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

		sb.append(cliente.getEndereco().getUF() + ";");
	
		sb.append(cliente.getEndereco().getCep().replace(".", "") + ";");
		
		sb.append(cliente.getEndereco().getisoPais().getSigla() + ";");
		
		sb.append("000" + cliente.getServicos().getProtocolo() + ";");
		
		sb.append(cliente.getServicos().getDataAgendada().replaceAll("\\D", "") + ";");
		
		sb.append(cliente.getServicos().getHoraAgendada().replaceAll("\\D", "") + ";");
		
		sb.append(cliente.getServicos().getTipoServico().getSigla() + ";");
		
		sb.append(String.valueOf(cliente.getServicos().getValorServico()).replaceAll("\\D", "") + ";");
		
		sb.append(cliente.getServicos().getTipoNotificacao().getSigla());

		return sb.toString();

	}

}