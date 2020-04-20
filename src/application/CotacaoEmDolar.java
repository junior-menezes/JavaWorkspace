package application;

import java.util.Locale;
import java.util.Scanner;

import util.CotacaoDolar;

//tentar criar um app que calcula a cotação do dolar + IOF
public class CotacaoEmDolar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cotação em dolar");
		System.out.println("Digite o valor do Dolar em Reais: ");
		double valorD = sc.nextDouble();
		
		System.out.println("Quantos Dolares pretende comprar: ");
		double quantD = sc.nextDouble();
		
		System.out.printf("Total com IOF: %.2f", CotacaoDolar.Cotacao(valorD, quantD));
	}

}
