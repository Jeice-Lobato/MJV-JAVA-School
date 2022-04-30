package com.mjv.agua.luz.notificacao.app;

import java.time.LocalDate;
import java.time.LocalTime;

import com.mjv.agua.luz.notificacao.model.Cadastro;
import com.mjv.agua.luz.notificacao.model.Contrato;
import com.mjv.agua.luz.notificacao.model.Endereco;
import com.mjv.agua.luz.notificacao.service.Notificacao;
import com.mjv.agua.luz.notificacao.util.Formatador;

public class SistemaNotificacao {

	public static void main(String[] args) {
		
		
		Contrato cont = new Contrato();
		
		cont.setProtocolo(2022025687L);
		cont.setTipoServico("Água");
		cont.setValorServico(127.33);
		cont.setData(LocalDate.of(2022,2,21));
		cont.setHora(LocalTime.of(16,0));
		
		Cadastro cli = new Cadastro();
		cont.setCliente(cli);
		cli.setNome("Gleyson Sampaio");
		cli.setCpf("23476598727");
		
		
		Endereco end = new Endereco();
		cli.setEndereco(end);
		end.setBairro("Santo Antonio");
		end.setCep("27310657");
		end.setCidade("São Paulo");
		end.setComplemento("Ap 207, Bloco C");
		end.setLogradouro("Rua das Marias");
		end.setNumero("243");
		end.setEstado("SP");
		
		Notificacao nt = new Notificacao();
		 nt.gerar(cont);
		 
		 System.out.println(Formatador.formatarCpf(cli.getCpf()));
		 System.out.println(Formatador.formatarData(cont.getData()));
	}

}  
