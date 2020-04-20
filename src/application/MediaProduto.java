package application;

import java.util.Locale;
import java.util.Scanner;

import entities.ProdutoTresPontoZero;

public class MediaProduto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double media = 0.0;
		
		System.out.print("media de produtos \nDigite a quantidade: ");
		int n = sc.nextInt();
		ProdutoTresPontoZero[] produtos = new ProdutoTresPontoZero[n];
		
		for(int i=0; i < produtos.length; i++) {
			sc.nextLine();
			System.out.print("Nome e preco: ");			
			produtos[i] = new ProdutoTresPontoZero(sc.next(), sc.nextDouble());
			
			//String nome = sc.nextLine();
			//double preco = sc.nextDouble();
			//produtos[i] = new ProdutoTresPontoZero(nome, preco);
			media += produtos[i].getPreco();
			//System.out.println(produtos[i].getName());
		}
		media = media / n;
		System.out.println("Media dos preços dos produtos: " + media);
		
		for(int i=0; i < produtos.length; i++) {
			System.out.println(produtos[i]);
		}
		
	}

}
