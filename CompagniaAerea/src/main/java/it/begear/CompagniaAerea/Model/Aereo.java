package it.begear.CompagniaAerea.Model;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aereo")
public class Aereo {

	@Id
	@Column(name = "id_aereo")
	private int idAereo;

	@Column(name = "compagnia_aerea", nullable = false)
	private String compagniaAerea;

	@Column(name = "n_posti_economy", nullable = false)
	private int postiInEconomy;

	@Column(name = "n_posti_standard", nullable = true)
	private int postiInStandard;

	@Column(name = "n_posti_business", nullable = true)
	private int postiInBusiness;

	public Aereo() {
	}

	public Aereo(int idAereo, String compagniaAerea, int postiInEconomy, int postiInStandard, int postiInBusiness) {

		this.idAereo = idAereo;
		this.compagniaAerea = compagniaAerea;
		this.postiInEconomy = postiInEconomy;
		this.postiInStandard = postiInStandard;
		this.postiInBusiness = postiInBusiness;

	}

	public int getIdAereo() {
		return idAereo;
	}

	public void setIdAereo(int idAereo) {
		this.idAereo = idAereo;
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
		return "Aereo [idAereo=" + idAereo + ", compagniaAerea=" + compagniaAerea + ", postiInEconomy=" + postiInEconomy
				+ ", postiInStandard=" + postiInStandard + ", postiInBusiness=" + postiInBusiness + "]";
	}

}