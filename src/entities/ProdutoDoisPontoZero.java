package entities;

public class ProdutoDoisPontoZero {
	public String nome;
	public double preco;
	public int quantidade;
	
	//SOBRECARGA
	/**
	public ProdutoDoisPontoZero(String nome, double preco, int quantidade) {
		
	}
	**/
	//Construtor 1
	public ProdutoDoisPontoZero(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	//Construtor 2 
	public ProdutoDoisPontoZero(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		//quantidade = 0; Poderia iniciar a variável quantidade com zero por ser numero
		//ou posso optar por não iniciar visto que quando o objeto é iniciado as variáveis
		//não instanciadas recebem seus valores padrões (Strings = Null e Numeros = 0 ou 0.0)
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
