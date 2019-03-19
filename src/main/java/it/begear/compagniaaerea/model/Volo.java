package it.begear.compagniaaerea.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "volo")

public class Volo {

	@Id
	@Column(name = "id_volo")
	private String idVolo;

	@Column(name = "data_arrivo")
	private String dataArrivo;

	@Column(name = "data_partenza")
	private String dataPartenza;

	@Column(name = "luogo_arrivo")
	private String luogoArrivo;

	@Column(name = "luogo_partenza")
	private String luogoPartenza;

	public Volo() {
	}

	public Volo(String idVolo, String dataArrivo, String dataPartenza, String luogoArrivo, String luogoPartenza) {
		this.idVolo = idVolo;
		this.dataArrivo = dataArrivo;
		this.dataPartenza = dataPartenza;
		this.luogoArrivo = luogoArrivo;
		this.luogoPartenza = luogoPartenza;
	}

	public String getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(String idVolo) {
		this.idVolo = idVolo;
	}

	public String getDataArrivo() {
		return dataArrivo;
	}

	public void setDataArrivo(String dataArrivo) {
		this.dataArrivo = dataArrivo;
	}

	public String getDataPartenza() {
		return dataPartenza;
	}

	public void setDataPartenza(String dataPartenza) {
		this.dataPartenza = dataPartenza;
	}

	public String getLuogoArrivo() {
		return luogoArrivo;
	}

	public void setLuogoArrivo(String luogoArrivo) {
		this.luogoArrivo = luogoArrivo;
	}

	public String getLuogoPartenza() {
		return luogoPartenza;
	}

	public void setLuogoPartenza(String luogoPartenza) {
		this.luogoPartenza = luogoPartenza;
	}

	@Override
	public String toString() {
		return "Volo [idVolo=" + idVolo + ", dataArrivo=" + dataArrivo + ", dataPartenza=" + dataPartenza
				+ ", luogoArrivo=" + luogoArrivo + ", luogoPartenza=" + luogoPartenza + "]";
	}

}
