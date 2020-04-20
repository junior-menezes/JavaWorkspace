package application;

import java.util.Locale;
import java.util.Scanner;

import util.CalculaArea;

/*
 * Estudando orientação a objetos estaticos
 */
public class AreaCircunferencia	 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do Raio: ");
		double raio = sc.nextDouble();
		
		//Visto que criei um classe com metodos estáticos não é preciso instancear o objeto CalculaArea.
		//Muito legal.
		double circunferencia = CalculaArea.circunferencia(raio);
		double volume = CalculaArea.volume(raio);
		
		System.out.printf("Circunferencia: %.2f%n", circunferencia);
		System.out.printf("Volume: %.2f%n", volume);
		System.out.printf("Valor de PI: %.5f%n", CalculaArea.PI);
		
		
	}

}
