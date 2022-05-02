package agua.Luz.Case2.Atração.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import agua.Luz.Case2.Atração.model.Cliente;
import agua.Luz.Case2.Atração.model.Endereco;
import agua.Luz.Case2.Atração.model.Paises;
import agua.Luz.Case2.Atração.model.Servicos;
import agua.Luz.Case2.Atração.model.TipoNotificacao;
import agua.Luz.Case2.Atração.model.TipoServico;

public class ClienteRepository {
	// Banco de dados fake
	
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public List<Cliente> listar() {
		
		
Servicos sc = new Servicos();
		
		sc.setProtocolo(2022025687L);
		sc.setData(LocalDate.of(2022,5,7));
		sc.setHora(LocalTime.of(15,21));
		sc.setTipoServico(TipoServico.AGUA);//Encapsulamento, colocando o valor do serviço dentro do TipoServiço.
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
		
		clientes.add(cli);
		return clientes;
		
	}
}
