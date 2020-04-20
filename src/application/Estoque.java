package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Estoque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Digite as informações do Produto: ");
		System.out.print("Nome: ");
		produto.nome = sc.nextLine();
		System.out.print("Preço: ");
		produto.preco = sc.nextDouble();
		System.out.print("Quantidade no estoque: ");
		produto.quantidade = sc.nextInt();
		
		//System.out.println(produto.nome + ", " + produto.preco + ", " + produto.quantidade);
		System.out.println(produto);
		
		System.out.println();
		System.out.println("Entrada de produto no Estoque, digite a quantidade: ");
		int quantidade = sc.nextInt();
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
