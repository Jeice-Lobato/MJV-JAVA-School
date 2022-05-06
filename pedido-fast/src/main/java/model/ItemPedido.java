package model;
//05/05/2022
//Aluna: Jeice Lobato
//Exercício UML - Pedido Fast.
public class ItemPedido {

	private Produto produto;
	private Double valorProduto;
	private Double valorTotalProduto;
	private Short quantidadeProduto;

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getValorProduto() {
		return valorProduto;
	}

	public void setValorProduto(Double valorProduto) {
		this.valorProduto = valorProduto;
	}

	public Double getValorTotalProduto() {
		return valorTotalProduto;
	}

	public void setValorTotalProduto(Double valorTotalProduto) {
		this.valorTotalProduto = valorTotalProduto;
	}

	public Short getQuantidadeProduto() {
		return quantidadeProduto;
	}

	public void setQuantidadeProduto(Short quantidadeProduto) {
		this.quantidadeProduto = quantidadeProduto;
	}

}
