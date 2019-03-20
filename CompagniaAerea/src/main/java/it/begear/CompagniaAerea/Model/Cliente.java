package it.begear.CompagniaAerea.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity(name = "Cliente")
@Table(name = "cliente")
public class Cliente {
	
	@Id
	@Column(name = "username", insertable = false, updatable = false)
	private String username;

	@Column(name = "nome", nullable = false)
	private String nome;

	@Column(name = "cognome", nullable = false)
	private String cognome;

	@Column(name = "cf", nullable = false)
	private String cf;

	@OneToMany(mappedBy = "cliente", cascade= CascadeType.ALL)
	private List<Prenotazione> listaPrenotazioniVoli = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(String nome, String cognome, String cf, String username) {
		this.nome = nome;
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

	public List<Prenotazione> getListaPrenotazioniVoli() {
		return listaPrenotazioniVoli;
	}

	public void setListaPrenotazioniVoli(List<Prenotazione> listaPrenotazioniVoli) {
		this.listaPrenotazioniVoli = listaPrenotazioniVoli;
	}
	

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + ", cf=" + cf + ", username=" + username + "]";
	}
	
	public  Prenotazione aggiungiVolo (Volo volo, String postoAssegnato, String classe) {
		Prenotazione prenotazione = new Prenotazione(this, volo, postoAssegnato, classe);
		listaPrenotazioniVoli.add(prenotazione);
		volo.getListaPrenotazioniClienti().add(prenotazione);
		
		return prenotazione;
	}

}