package application;

import java.util.Locale;
import java.util.Scanner;

import entities.QuartosHotel;

public class Hotel {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		QuartosHotel[] quartos = new QuartosHotel[10];
		
		System.out.print("Quantos precisam: ");
		int qQuartos = sc.nextInt();
		int reservas[] = new int[qQuartos];
		
		System.out.print("Quais quartos de 1 a 10?: ");
		for(int i=0; i < reservas.length; i++) {
			System.out.print("Digite o quarto: " + i);
			sc.nextLine();
			reservas[i] = sc.nextInt();
			System.out.println("Quarto " + i + " reservado.");
			System.out.println("teste " + reservas[i]);
		}
		
		for(int i=0; i < reservas.length; i++) {
			System.out.println("Digite Nome e Email seguido de enter");
			//String nome = sc.nextLine();
			//sc.nextLine();
			//String email = sc.nextLine();
			sc.nextLine();
			quartos[reservas[i]] = new QuartosHotel(reservas[i], sc.nextLine(), sc.nextLine());
		}
		
		System.out.println("Relatório de reservas:");
		for(int i=0; i < quartos.length; i++) {
			if(quartos[i] != null) {
				System.out.println(quartos[i]);
			}
		}
		
		sc.close();
	}

}
