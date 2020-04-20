package application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entities.QuartosHotel;

public class Hotel2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		QuartosHotel[] quartos = new QuartosHotel[10];
		
		Integer qQuartos = Integer.parseInt(JOptionPane.showInputDialog("Reserva de Quartos."
				+ "\nQuantidade: "));
		/*Integer reservas[] = new [qQuartos];
		
		
		for(int i=0; i < reservas.length; i++) {
			reservas[i] = (int) Double.parseDouble(JOptionPane.showInputDialog("Quais quartos de 1 a 10? \nDigite o quarto: " + (i+1) + ": "));
			
			JOptionPane.showMessageDialog(null, "Quarto " + (i+1) + " reservado.");
		}
		*/
		
		
		for(int i=0; i < qQuartos; i++) {
			Integer quartoSelecionado = Integer.parseInt(
					JOptionPane.showInputDialog("Selecione o quarto: " + (i+1) + ": "));
			quartos[quartoSelecionado] = new QuartosHotel(
				quartoSelecionado, 
				JOptionPane.showInputDialog("Nome: "), 
				JOptionPane.showInputDialog("Email: ")
			);
		}
		
		String relatorio = null;
		for(QuartosHotel obj : quartos) {
			if(obj != null) {
				String aux = obj.toString();
				
				if(relatorio != null) {
					relatorio += aux;
				}
				else {
					relatorio = aux;
				}
				
			}
		}

		JOptionPane.showMessageDialog(null, "Relatório de reserva de quartos:\n" + relatorio);
		JOptionPane.showMessageDialog(null, Arrays.deepToString(quartos));
	}

}
