package entities;

public class clienteBanco {
	private int nConta;
	private String nome;
	private double saldo;
	private final double TAXA = 5.00;
	public clienteBanco() {
		
	}
	
	public clienteBanco(int nConta, String nome) {
		this.nConta = nConta;
		this.nome = nome;
		
	}
	
	public clienteBanco(int nConta, String nome, double depositoInicial) {
		this.nConta = nConta;
		this.nome = nome;
		deposito(depositoInicial);
	}

	public double getSaldo() {
		return saldo;
	}

	public int getnConta() {
		return nConta;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void deposito(double deposito) {
		saldo += deposito;
	}
	
	public void saque(double saque) {
		if(saque > 0) {
			saldo -= saque + TAXA;
		}
	}
	
	public String toString() {
		return	"Informação da conta:\n"
				+ "Conta: "
				+ nConta
				+ "\nNome: "
				+ nome
				+ "\nSaldo atual R$: " + String.format("%.2f", saldo);
	}
	
}
