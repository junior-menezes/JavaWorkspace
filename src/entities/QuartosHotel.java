package entities;

public class QuartosHotel {
	
	private Integer quarto;
	private String nome;
	private String email;
	
	

	public QuartosHotel(Integer quarto, String nome, String email) {
		this.quarto = quarto;
		this.nome = nome;
		this.email = email;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getQuarto() {
		return quarto;
	}
	
	public String toString() {
		return "Quarto "
				+ quarto
				+ ": "
				+ nome
				+ ", "
				+ email
				+ "\n";
	}
}
