package it.begear.compagniaaerea.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Volo {
	@Id
	@Column(name= "id_volo")
	private int idVolo;
	
	public Volo() {}
	
	public Volo(int idVolo) {
		this.idVolo= idVolo;
	}

	public int getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(int idVolo) {
		this.idVolo = idVolo;
	}

	@Override
	public String toString() {
		return "Volo [idVolo=" + idVolo + "]";
	}
	
	
}
