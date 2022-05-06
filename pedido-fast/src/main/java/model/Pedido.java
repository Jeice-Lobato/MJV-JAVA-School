package model;
//05/05/2022
//Aluna: Jeice Lobato
//Exercício UML - Pedido Fast.
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Pedido {

	private Cliente cliente;
	private long protocolo;
	private LocalDateTime dataHora;
	private Double frete;
	private LocalDate prazoEntrega;
	private Double desconto;
	private Double valorTotalPedido;
	private ItemPedido itemPedido;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public long getProtocolo() {
		return protocolo;
	}

	public void setProtocolo(long protocolo) {
		this.protocolo = protocolo;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public Double getFrete() {
		return frete;
	}

	public void setFrete(Double frete) {
		this.frete = frete;
	}

	public LocalDate getPrazoEntrega() {
		return prazoEntrega;
	}

	public void setPrazoEntrega(LocalDate prazoEntrega) {
		this.prazoEntrega = prazoEntrega;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getValorTotalPedido() {
		return valorTotalPedido;
	}

	public void setValorTotal(Double valorTotalPedido) {
		this.valorTotalPedido = valorTotalPedido;
	}

	public ItemPedido getItemPedido() {
		return itemPedido;
	}

	public void setItemPedido(ItemPedido itemPedido) {
		this.itemPedido = itemPedido;
	}

}