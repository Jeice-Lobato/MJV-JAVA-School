package com.mjv.aguaLuz;
//23/04/2022
//Aluna: Jeice Lobato
public class Notificacao {
	
	public void exibirMensagem(Cliente cl) {
		
		System.out.println("Senhor(a) " + cl.getNome() + " cpf de n�mero " + cl.getCpfCnpj() + ", Informamos que conforme contrato com protocolo de n�mero " + cl.getServicos().getProtocolo()+ " est�\nagendado para a data\\hora " + cl.getServicos().getDataAgendada() +" "+ cl.getServicos().getHoraAgendada() +"h a instala��o do servi�o de " + cl.getServicos().getTiposervico() + " com taxa de valor R$" + cl.getServicos().getValorServico().toString().replace(".","," ) + " em sua resid�ncia localizada no\nendere�o abaixo:");

		StringBuilder sb = new StringBuilder();
				
			sb.append("\nLogradouro: " + cl.getEndereco().getLogradouro());
			sb.append("\nComplemento: " + cl.getEndereco().getComplemento());
			sb.append("\nBairro: " + cl.getEndereco().getBairro());
			sb.append("\nCidade: " + cl.getEndereco().getCidade() + " / " + cl.getEndereco().getEstado());
			sb.append("\nCep: " + cl.getEndereco().getCep());
			System.out.println(sb.toString());
	}

} 
