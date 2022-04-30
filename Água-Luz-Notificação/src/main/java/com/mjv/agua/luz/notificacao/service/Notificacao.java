package com.mjv.agua.luz.notificacao.service;


import com.mjv.agua.luz.notificacao.model.Cadastro;
import com.mjv.agua.luz.notificacao.model.Contrato;
import com.mjv.agua.luz.notificacao.model.Endereco;
import com.mjv.agua.luz.notificacao.util.Formatador;


public class Notificacao {

	
	public void gerar(Contrato cont) {
	

	StringBuilder sb = new StringBuilder();
		
	Endereco end = cont.getCliente().getEndereco();
	Cadastro cli = cont.getCliente();
	
	String nome = cli.getNome();
	String cpfFormatado = Formatador.formatarCpf(cli.getCpf());
	String valorFormatado = Formatador.formatarValor(cont.getValorServico());
	
	sb.append(String.format("Senhor(a) %s cfp de número %s", nome, cpfFormatado)); 
	sb.append(String.format(", Informamos que conforme contrato com protocolo de número %d", cont.getProtocolo()));
	sb.append(" está agendado para a data\\hora " + Formatador.formatarData(cont.getData()) + " "+ cont.getHora());
	sb.append("h a instalaçao do serviço de " + cont.getTipoServico());
	sb.append(String.format(" com taxa de valor R$ %s  em sua residência localizada no\nendereço abaixo: \n", valorFormatado));
	sb.append("\n");
	
	sb.append("Logradouro:"+end.getLogradouro()+", "+end.getNumero()+ "\n");
	sb.append("Complemento:"+end.getComplemento()+"\n");
	sb.append("Bairro:"+end.getBairro()+"\n");
	sb.append("Cidade:"+end.getCidade()+"/"+end.getEstado()+"\n");
	sb.append("Cep:"+end.getCep());
	
	System.out.println(sb.toString());
		
		
	
	}		
		
}
