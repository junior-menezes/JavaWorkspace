package entities;

public class Produto {
	
	public String nome;
	public double preco;
	public int quantidade;
	
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
				+ ", Pre�o unit�rio $R " + String.format("%.2f", preco)
				+ ", Quantidade em Estoque " + quantidade
				+ ", Valor total em Estoque " + String.format("%.2f", totalValorEmEstoque());
	}
}
