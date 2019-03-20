package it.begear.CompagniaAerea.Model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PrenotazioneID implements Serializable {

	@Column(name = "id_volo" , insertable = false, updatable = false)
	private int idVolo;
	@Column(name = "username" , insertable = false, updatable = false)
	private String username;

	public PrenotazioneID() {
	}

	public PrenotazioneID(int idVolo, String username) {
		this.idVolo = idVolo;
		this.username = username;
	}

	public int getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idVolo, username);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		PrenotazioneID that = (PrenotazioneID) obj;
		return Objects.equals(idVolo, that.idVolo) && Objects.equals(username, that.username);
		
	}

	
}
