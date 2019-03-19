package it.begear.compagniaaerea.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Id;

public class Aereo {

	@Id
	@Column(name = "id_aereo")
	private int idAereo;

	@Column(name = "data_partenza")
	private Calendar dataPartenza;

	@Column(name = "data_arrivo")
	private Calendar dataArrivo;

	@Column(name = "luogo_partenza")
	private String luogoPartenza;

	@Column(name = "luogo_arrivo")
	private String luogoArrivo;

	@Column(name = "compagnia_aerea")
	private String compagniaAerea;

	@Column(name = "n_posti_economy")
	private int postiInEconomy;

	@Column(name = "n_posti_standard")
	private int postiInStandard;

	@Column(name = "n_posti_business")
	private int postiInBusiness;

	public Aereo() {
	}

	public Aereo(int idAereo, Calendar dataPartenza, Calendar dataArrivo, String luogoPartenza, String luogoArrivo,
			String compagniaAerea, int postiInEconomy, int postiInStandard, int postiInBusiness) {

		this.idAereo= idAereo;
		this.dataPartenza= dataPartenza;
		this.dataArrivo= dataArrivo;
		this.luogoPartenza= luogoPartenza;
		this.luogoArrivo= luogoArrivo;
		this.compagniaAerea= compagniaAerea;
		this.postiInEconomy= postiInEconomy;
		this.postiInStandard= postiInStandard;
		this.postiInBusiness= postiInBusiness;
		
	}

	public int getIdAereo() {
		return idAereo;
	}

	public void setIdAereo(int idAereo) {
		this.idAereo = idAereo;
	}

	public Calendar getDataPartenza() {
		return dataPartenza;
	}

	public void setDataPartenza(Calendar dataPartenza) {
		this.dataPartenza = dataPartenza;
	}

	public Calendar getDataArrivo() {
		return dataArrivo;
	}

	public void setDataArrivo(Calendar dataArrivo) {
		this.dataArrivo = dataArrivo;
	}

	public String getLuogoPartenza() {
		return luogoPartenza;
	}

	public void setLuogoPartenza(String luogoPartenza) {
		this.luogoPartenza = luogoPartenza;
	}

	public String getLuogoArrivo() {
		return luogoArrivo;
	}

	public void setLuogoArrivo(String luogoArrivo) {
		this.luogoArrivo = luogoArrivo;
	}

	public String getCompagniaAerea() {
		return compagniaAerea;
	}

	public void setCompagniaAerea(String compagniaAerea) {
		this.compagniaAerea = compagniaAerea;
	}

	public int getPostiInEconomy() {
		return postiInEconomy;
	}

	public void setPostiInEconomy(int postiInEconomy) {
		this.postiInEconomy = postiInEconomy;
	}

	public int getPostiInStandard() {
		return postiInStandard;
	}

	public void setPostiInStandard(int postiInStandard) {
		this.postiInStandard = postiInStandard;
	}

	public int getPostiInBusiness() {
		return postiInBusiness;
	}

	public void setPostiInBusiness(int postiInBusiness) {
		this.postiInBusiness = postiInBusiness;
	}

	@Override
	public String toString() {
		return "Aereo [idAereo=" + idAereo + ", dataPartenza=" + dataPartenza + ", dataArrivo=" + dataArrivo
				+ ", luogoPartenza=" + luogoPartenza + ", luogoArrivo=" + luogoArrivo + ", compagniaAerea="
				+ compagniaAerea + ", postiInEconomy=" + postiInEconomy + ", postiInStandard=" + postiInStandard
				+ ", postiInBusiness=" + postiInBusiness + "]";
	}
	
	
}