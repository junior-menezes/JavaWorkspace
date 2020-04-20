package application;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import java.util.List;

import entities.Funcionarios;

public class CadastroFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Funcionarios> cadastro = new ArrayList<>();
		
		Integer n = Integer.parseInt(JOptionPane.showInputDialog("Cadastro de funcinários."
				+ "\nQuantos cadastros serão iniciados?: "));
		
		for(int i=1; i <=n; i++) {
			cadastro.add(new Funcionarios(Integer.parseInt(JOptionPane.showInputDialog("ID: ")),
					JOptionPane.showInputDialog("Nome completo: "),
					Double.parseDouble(JOptionPane.showInputDialog("Salário: "))));
		}
		String relatorio = "";
		for(Funcionarios cadastrados : cadastro) {
			relatorio += cadastrados.toString();
		}
		
		JOptionPane.showMessageDialog(null, relatorio);
		
		Integer id = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do usuário para almentar o salario: "));
		Double porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Porcentagem de almento: "));
		
		
		for(int i=0; i < cadastro.size(); i++) {
			if(cadastro.get(i).getId() == id){
				cadastro.get(i).almentoSal(porcentagem);
			}
		}
		
		relatorio = "";
		for(Funcionarios cadastrados : cadastro) {
			relatorio += cadastrados.toString();
		}
		JOptionPane.showMessageDialog(null, relatorio);
	}

}
