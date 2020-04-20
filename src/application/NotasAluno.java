package application;
import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;


public class NotasAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		System.out.println("Validação das notas do aluno");
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.println("Digite a nota do semestre 1: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.println("Digite a nota do semestre 2: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.println("Digite a nota do semestre 3: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println(aluno);
		sc.close();
	}

}
