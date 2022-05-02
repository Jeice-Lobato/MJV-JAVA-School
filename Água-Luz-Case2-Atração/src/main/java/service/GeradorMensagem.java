package service;
//Aluna: Jeice Lobato


import agua.Luz.Case2.Atração.model.Cliente;
import agua.Luz.Case2.Atração.model.Endereco;
import agua.Luz.Case2.Atração.model.Servicos;
import agua.Luz.Case2.Atração.model.TipoServico;
import agua.Luz.Case2.Atração.util.FormatadorUtil;

public class GeradorMensagem {
	
	public void gerar(Cliente cli) {
		

		StringBuilder sb = new StringBuilder();
			
		Endereco end = cli.getEndereco();
		Servicos sc = cli.getServicos();
		
		String nome = cli.getNome();
		String cpfFormatado = FormatadorUtil.formatarCpf(cli.getCpf());
	
		
		sb.append(String.format("Senhor(a) %s cfp de número %s", nome, cpfFormatado)); 
		sb.append(String.format(", Informamos que conforme contrato com protocolo de número %d", sc.getProtocolo()));
		sb.append(" está agendado para a data\\hora " + FormatadorUtil.formatarData(sc.getData()) + " "+ sc.getHora());
		sb.append("h a instalaçao do serviço de " + sc.getTipoServico());
		sb.append(String.format(" com taxa de valor R$ %s  em sua residência localizada no\nendereço abaixo: \n",FormatadorUtil.valorFormatado(),TipoServico.values()));
		sb.append("\n");
		
		sb.append("Logradouro:"+end.getLogradouro()+", "+end.getNumero()+ "\n");
		sb.append("Complemento:"+end.getComplemento()+"\n");
		sb.append("Bairro:"+end.getBairro()+"\n");
		sb.append("Cidade:"+end.getCidade()+"/"+end.getUF()+"\n");
		sb.append("Cep:"+end.getCep());
		
		System.out.println(sb.toString());
			
			
		
		}		
			
	


}
