package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double somaNotas() {
		return nota1 + nota2 + nota3;
		
	}
	
	public String validaAprovacao() {
		String validacao;
		if(somaNotas()>= 60.0) {
			validacao = "Aprovado";
		}
		else {
			validacao = "Reprovado" + "\nFaltou " + (60.0 - somaNotas()) + " pontos";
		}
		return validacao;
		
	}
	
	public String toString () {
		return  nome
				+ ", Nota Final "
				+ somaNotas()
				+ "\nSituação: "
				+ validaAprovacao();
	}
	
}
