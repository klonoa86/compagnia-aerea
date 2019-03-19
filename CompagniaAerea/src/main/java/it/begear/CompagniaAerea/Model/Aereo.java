package it.begear.CompagniaAerea.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "aereo")
public class Aereo {

	@Id
	@Column(name = "id_aereo")
	private String idAereo;

	@Column(name = "compagnia_aerea", nullable = false)
	private String compagniaAerea;

	@Column(name = "n_posti_economy", nullable = false)
	private int postiInEconomy;

	@Column(name = "n_posti_standard", nullable = true)
	private int postiInStandard;

	@Column(name = "n_posti_business", nullable = true)
	private int postiInBusiness;

	@OneToOne(mappedBy = "aereo", cascade = { CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST,
			CascadeType.REFRESH })
	private Volo volo;

	public Aereo() {
	}

	public Aereo(String idAereo, String compagniaAerea, int postiInEconomy, int postiInStandard, int postiInBusiness) {

		this.idAereo = idAereo;
		this.compagniaAerea = compagniaAerea;
		this.postiInEconomy = postiInEconomy;
		this.postiInStandard = postiInStandard;
		this.postiInBusiness = postiInBusiness;

	}

	public String getIdAereo() {
		return idAereo;
	}

	public void setIdAereo(String idAereo) {
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

	public Volo getVolo() {
		return volo;
	}

	public void setVolo(Volo volo) {
		this.volo = volo;
	}

	@Override
	public String toString() {
		return "Aereo [idAereo=" + idAereo + ", compagniaAerea=" + compagniaAerea + ", postiInEconomy=" + postiInEconomy
				+ ", postiInStandard=" + postiInStandard + ", postiInBusiness=" + postiInBusiness + "]";
	

}
}
