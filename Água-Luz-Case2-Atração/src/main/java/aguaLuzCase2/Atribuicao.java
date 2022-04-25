package aguaLuzCase2;
// 24/04/2022
// Aluna: Jeice Lobato
// Projeto Água e Luz - Case 2 - Atração
public class Atribuicao {
	
	public static void main(String[] args) {
		//Instanciando as Classes e enums para atribuir os valores informados. OBS: ENUM é imutável!
        Servicos sc = new Servicos();
		
		sc.setProtocolo("2022025687");
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
		end.setNumero("123");
		end.setLogradouro("Rua Sebastião Firmino");
		end.setUF("SP");
		end.setisoPais(Paises.BRASIL);
		
		Cliente cli = new Cliente();
		
		cli.setNome("Raimundo Nonato Loureiro Castelo Branco");
		cli.setCpf("007.324.223.21");
		cli.setRg("337655");
		cli.setCelular("(11) 99768-1515");
		cli.setEndereco(end);
		cli.setServicos(sc);
		
	}

}



