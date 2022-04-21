package openbanking;
//21/04/2022
import java.time.LocalDate;

public class Movimentacao {
	private LocalDate data;
	private Double valor;
	private TipoMovimentacao tipoMovimentacao;
	private Boolean estorno;
	
	Movimentacao(LocalDate data, Double valor, TipoMovimentacao tipoMovimentacao,Boolean estorno) {
		this.data = data;
		this.valor = valor;
		this.tipoMovimentacao = tipoMovimentacao;
		this.estorno = estorno;
	}
	
	Movimentacao() {

}
}