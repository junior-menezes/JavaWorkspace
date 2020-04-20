package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoDoisPontoZero;

public class EstoqueDoisPontoZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//"Produto produto = new Produto();" Esta linha foi tirada porque crei um construtor
		//no produto 2.0, para não ter erro de criar um produto sem atributos como nome,
		//preço e quantidade.
		
		System.out.println("Digite as informações do Produto: ");
		System.out.print("Nome: ");		
		String nome = sc.nextLine();
		
		System.out.print("Preço: ");
		double preco = sc.nextDouble();
		
		System.out.print("Quantidade no estoque: ");
		int quantidade = sc.nextInt();
		
		ProdutoDoisPontoZero produto = new ProdutoDoisPontoZero(nome, preco, quantidade);
		
		//System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Entrada de produto no Estoque, digite a quantidade: ");
		quantidade = sc.nextInt();
		produto.addProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização do produto: " + produto);
		
		System.out.println();
		System.out.println("Retirada de produto no Estoque, digite a quantidade: ");
		quantidade = sc.nextInt();
		produto.retiraProdutos(quantidade);
		
		System.out.println();
		System.out.println("Atualização do produto: " + produto);
		
		sc.close();
	}

}
