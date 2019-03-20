package it.begear.CompagniaAerea.Model;


public class Cliente {
	private String nome;
	private String cognome;
	private String cf;
	private String username;

	
	public Cliente() {}
	
	public Cliente(String nome, String cognome, String cf, String username) {
		this.nome=nome;
		this.cognome=cognome;
		this.cf=cf;
		this.username=username;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getCf() {
		return cf;
	}

	public void setCf(String cf) {
		this.cf = cf;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", cf=" + cf + ", username=" + username + "]";
	}
	
	

}
