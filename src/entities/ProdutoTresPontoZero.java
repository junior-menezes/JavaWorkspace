package entities;

public class ProdutoTresPontoZero {
	private String nome;
	private double preco;
	private int quantidade;
	
	//SOBRECARGA
	/**
	public ProdutoTresPontoZero(String nome, double preco, int quantidade) {
		
	}
	**/
	//Construtor 1
	public ProdutoTresPontoZero(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	//Construtor 2 
	public ProdutoTresPontoZero(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getName() {
		return nome;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double totalValorEmEstoque() {
		return preco * quantidade;
	}
	
	public void addProdutos(int quantidade) {
		this.quantidade += quantidade;
	}
	
	public void retiraProdutos(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return "\nNome: " + nome
				+ ", Preço unitário $R " + String.format("%.2f", preco)
				+ ", Quantidade em Estoque " + quantidade
				+ ", Valor total em Estoque " + String.format("%.2f", totalValorEmEstoque());
	}
}
