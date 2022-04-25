package com.mjv.aguaLuz;
//23/04/2022
//Aluna: Jeice Lobato
public class Notificacao {
	
	public void exibirMensagem(Cliente cl) {
		
		System.out.println("Senhor(a) " + cl.getNome() + " cpf de número " + cl.getCpfCnpj() + ", Informamos que conforme contrato com protocolo de número " + cl.getServicos().getProtocolo()+ " está\nagendado para a data\\hora " + cl.getServicos().getDataAgendada() +" "+ cl.getServicos().getHoraAgendada() +"h a instalação do serviço de " + cl.getServicos().getTiposervico() + " com taxa de valor R$" + cl.getServicos().getValorServico().toString().replace(".","," ) + " em sua residência localizada no\nendereço abaixo:");

		StringBuilder sb = new StringBuilder();
				
			sb.append("\nLogradouro: " + cl.getEndereco().getLogradouro());
			sb.append("\nComplemento: " + cl.getEndereco().getComplemento());
			sb.append("\nBairro: " + cl.getEndereco().getBairro());
			sb.append("\nCidade: " + cl.getEndereco().getCidade() + " / " + cl.getEndereco().getEstado());
			sb.append("\nCep: " + cl.getEndereco().getCep());
			System.out.println(sb.toString());
	}

} 
