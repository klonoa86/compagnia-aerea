package it.begear.CompagniaAerea.Main;

import it.begear.CompagniaAerea.Model.Aereo;
import it.begear.CompagniaAerea.Model.Cliente;
import it.begear.CompagniaAerea.Model.Volo;
import it.begear.CompagniaAerea.dao.DAO;
import it.begear.CompagniaAerea.dao.DAOImpl;

public class Main {

	public static void main(String[] args) {
		DAO dao= DAOImpl.getInstance();
		
		Aereo aereo=dao.read(Aereo.class, "Az55");
		
		Volo volo=new Volo("2019/12/12", "2019/12/12", "Napoli", "Milano", aereo);
//		dao.create(aereo);
		dao.create(volo);
		
	}

}
