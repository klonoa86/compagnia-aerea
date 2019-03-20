package it.begear.CompagniaAerea.Model;

import java.util.Objects;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity(name = "Prenotazione")
@Table(name = "prenotazione")
public class Prenotazione {
	
	@EmbeddedId
	private PrenotazioneID prenotazioneId;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "username", insertable=false, updatable=false)
	private Cliente cliente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_volo", insertable=false, updatable=false)
	private Volo volo;

	@Column(name = "posto_assegnato")
	private String postoAssegnato;

	@Column(name = "classe")
	private String classe;

	public Prenotazione() {

	}

	public Prenotazione(Cliente cliente, Volo volo, String postoAssegnato, String classe) {
		this.volo = volo;
		this.cliente = cliente;
		this.postoAssegnato = postoAssegnato;
		this.classe = classe;
		this.prenotazioneId= new PrenotazioneID(volo.getIdVolo(), cliente.getUsername());

	}

	public PrenotazioneID getPrenotazioneId() {
		return prenotazioneId;
	}

	public void setPrenotazioneId(PrenotazioneID prenotazioneId) {
		this.prenotazioneId = prenotazioneId;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Volo getVolo() {
		return volo;
	}

	public void setVolo(Volo volo) {
		this.volo = volo;
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
	public int hashCode() {
		return Objects.hash(cliente,volo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Prenotazione that = (Prenotazione) obj;
		return Objects.equals(cliente, that.cliente) && Objects.equals(volo, that.volo);
	}

	
	

}