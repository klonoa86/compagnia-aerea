package it.begear.compagniaaerea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cognome")
	private String cognome;
	
	@Column(name = "cf")
	private String cf;
	
	@Id
	@Column(name = "username")
	private String username;
	
	
	
	public Cliente() {}
	
	public Cliente(String nome, String cognome, String cf, String username) {
		this.nome= nome;
		this.cognome = cognome;
		this.cf = cf;
		this.username = username;
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
