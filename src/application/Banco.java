package application;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.clienteBanco;

public class Banco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double deposito;
		clienteBanco cliente;
		
		System.out.println("Contas Bancaria\n");
		System.out.print("Digite o numero da conta: ");
		int nConta = sc.nextInt();
		
		System.out.print("Digite o nome do titular: ");
		sc.nextLine();
		String nomeConta = sc.nextLine();
			
		System.out.print("Deposito inicial? (S/N): ");
		//sc.nextLine();
		char sn = sc.next().charAt(0);
				
		if(sn == 's' || sn == 'S') {
			System.out.println("Digite o valor do deposito inicial: ");
			cliente = new clienteBanco(nConta, nomeConta, deposito = sc.nextDouble());
			
		}
		else {
			cliente = new clienteBanco(nConta, nomeConta);
		}
		
		System.out.println(cliente.toString());
		
		System.out.print("Deposito. Digite o Valor: ");
		cliente.deposito(sc.nextDouble());
		System.out.println(cliente.toString());
		
		System.out.println("Saque. Digite o valor: ");
		cliente.saque(sc.nextDouble());
		
		System.out.println(cliente.toString());
		
		sc.close();
		
	}

}
