package agua.Luz.Case2.Atração.model;

import java.time.LocalDate;
import java.time.LocalTime;

//24/04/2022
//Aluna: Jeice Lobato
//Projeto Água e Luz - Case 2 - Atraçao

public class Servicos {
	
	private Long protocolo;
	private Double valorServico;
	private LocalDate data = LocalDate.of(2022,05,7);
	private LocalTime hora = LocalTime.of(00,01);
	private TipoServico tipoServico;
	private TipoNotificacao tipoNotificacao;
	

	public Long getProtocolo() {
		return protocolo;
	}
	
	public void setProtocolo (Long protocolo) {
		this.protocolo = protocolo;
	}
	
	public Double getValorServico() {
		return valorServico;
	}
	
	

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public TipoServico getTipoServico() {
		return tipoServico;
	}
	
	public void setTipoServico(TipoServico TipoServico) {
		this.tipoServico = TipoServico;
		this.valorServico = valorServico; // Encapsulamento, colocando o valor do serviço, no Tiposerviço.
	}
	
	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}

	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}


}



