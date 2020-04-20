package application;

import java.util.Locale;
import java.util.Scanner;

public class Arranjos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double media = 0;
		System.out.print("digite o tamnho do vetor: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		
		for (int i=0; i < n; i++) {
			//System.out.print("digite o numero da posição "+ (i+1) + ": ");
			vetor[i] = sc.nextDouble();
			media += vetor[i];
		}
		media = media / n;
		System.out.printf("media dos " + n + " numeros: %.2f%n", media);
		
		sc.close();
	}

}
