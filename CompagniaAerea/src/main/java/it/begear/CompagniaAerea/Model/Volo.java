package it.begear.CompagniaAerea.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "volo")

public class Volo {

	@Id
	@Column(name = "id_volo")
	private int idVolo;

	@Column(name = "data_arrivo")
	private String dataArrivo;

	@Column(name = "data_partenza")
	private String dataPartenza;

	@Column(name = "luogo_arrivo")
	private String luogoArrivo;

	@Column(name = "luogo_partenza")
	private String luogoPartenza;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id_aereo")
	private Aereo aereo;

	public Volo() {
	}
		
	public Volo(String dataArrivo, String dataPartenza, String luogoArrivo, String luogoPartenza, Aereo aereo) {
		this.dataArrivo = dataArrivo;
		this.dataPartenza = dataPartenza;
		this.luogoArrivo = luogoArrivo;
		this.luogoPartenza = luogoPartenza;
		this.aereo=aereo;
	}
	
	public int getIdVolo() {
		return idVolo;
	}

	public void setIdVolo(int idVolo) {
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
	
	public Aereo getAereo() {
		return aereo;
	}

	public void setAereo(Aereo aereo) {
		this.aereo = aereo;
	}

	

	@Override
	public String toString() {
		return "Volo [idVolo=" + idVolo + ", dataArrivo=" + dataArrivo + ", dataPartenza=" + dataPartenza
				+ ", luogoArrivo=" + luogoArrivo + ", luogoPartenza=" + luogoPartenza + "]";
	}

}