package aguaLuzCase2;


public class Servicos {
	
	private String protocolo;
	private Double valorServico;
	private String dataAgendada;
	private String horaAgendada;
	private TipoServico tipoServico;
	private TipoNotificacao tipoNotificacao;
	

	public String getProtocolo() {
		return protocolo;
	}
	
	public void setProtocolo (String protocolo) {
		this.protocolo = protocolo;
	}
	
	public Double getValorServico() {
		return valorServico;
	}
	
	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}
	

	public String getDataAgendada() {
		return dataAgendada;
	}

	public void setDataAgendada(String dataAgendada) {
		this.dataAgendada = dataAgendada;
	}

	public String getHoraAgendada() {
		return horaAgendada;
	}

	public void setHoraAgendada(String horaAgendada) {
		this.horaAgendada = horaAgendada;
	}
	
	public TipoServico getTipoServico() {
		return tipoServico;
	}
	
	public void setTipoServico(TipoServico TipoServico) {
		this.tipoServico = TipoServico;
	}
	
	public TipoNotificacao getTipoNotificacao() {
		return tipoNotificacao;
	}

	public void setTipoNotificacao(TipoNotificacao tipoNotificacao) {
		this.tipoNotificacao = tipoNotificacao;
	}


}



