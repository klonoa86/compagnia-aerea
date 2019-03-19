package it.begear.CompagniaAerea.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "prenotazione")

public class Prenotazione {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id_prenotazione")
	private int idPrenotazione;

	@Column(name = "posto_assegnato", nullable = false)
	private String postoAssegnato;

	@Column(name = "classe", nullable = false)
	private String classe;

	public Prenotazione() {

	}

	public Prenotazione(int idPrenotazione, String postoAssegnato, String classe) {
		this.postoAssegnato = postoAssegnato;
		this.classe = classe;
		this.idPrenotazione = idPrenotazione;

	}

	public int getIdPrenotazione() {
		return idPrenotazione;
	}

	public void setIdPrenotazione(int idPrenotazione) {
		this.idPrenotazione = idPrenotazione;
	}

	public String getPostoAssegnato() {
		return postoAssegnato;
	}

	public void setPostoAssegnato(String postoAssegnato) {
		this.postoAssegnato = postoAssegnato;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "Prenotazione [idPrenotazione=" + idPrenotazione + ", postoAssegnato=" + postoAssegnato + ", classe="
				+ classe + "]";
	}

}