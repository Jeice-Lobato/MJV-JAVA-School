package com.mjv.aguaLuz;
//23/04/2022
//Aluna: Jeice Lobato
public class SistemaAgendamento {

	public static void main(String[] args) {

		
		Servicos sc = new Servicos();
		
		sc.setProtocolo("2022025687");
		sc.setTipoServico("Água");
		sc.setValorServico(127.33);
		sc.setDataAgendada("21/02/2022");
		sc.setHoraAgendada("16:00");
	
		
		Endereco end = new Endereco();
		
		end.setBairro("Santo Antonio");
		end.setCep("27.310-657");
		end.setCidade("São Paulo");
		end.setComplemento("Ap 207, Bloco C");
		end.setLogradouro("Rua das Marias, 243");
		end.setEstado("SP");
		
		Cliente cli = new Cliente();
		
		cli.setNome("Gleyson Sampaio");
		cli.setCpfCnpj("234.765.987-27");
		cli.setEndereco(end);
		cli.setServicos(sc);
		
		
		Notificacao nt = new Notificacao();
		
		nt.exibirMess(cli);
	}

}
