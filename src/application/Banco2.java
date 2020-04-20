package application;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.clienteBanco;

public class Banco2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		clienteBanco cliente = new clienteBanco(
				(int) Double.parseDouble(JOptionPane.showInputDialog("Digite o numero da conta: ")),
				JOptionPane.showInputDialog("Digite o nome do titular: ")
				);
		
		JOptionPane.showMessageDialog(null, cliente.toString());
		
		
		String sn = JOptionPane.showInputDialog("Deposito inicial? (S/N): ");
				
		if(sn.contains("s") || sn.contains("S")) {
			cliente.deposito(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito inicial: ")));
		}
		
		JOptionPane.showMessageDialog(null, cliente.toString());
		
		cliente.deposito(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do deposito: ")));
		
		JOptionPane.showMessageDialog(null, cliente.toString());
		
		cliente.saque(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do saque: ")));

		
		JOptionPane.showMessageDialog(null, cliente.toString());
		
		
	}

}
