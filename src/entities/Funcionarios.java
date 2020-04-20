package entities;

public class Funcionarios {
	private Integer id;
	private String nome;
	private Double salario;
	
	
	public Funcionarios(Integer id, String nome, Double salario) {
		
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}


	public Integer getId() {
		return id;
	}
	public String toString() {
		return "ID: "
				+ id
				+ ", Nome: "
				+ nome
				+ ", Salário "
				+ salario
				+ "\n";
	}
	
	public void almentoSal(Double porcentagem) {
		salario = salario * (1 + porcentagem/100);
	}
	
}
