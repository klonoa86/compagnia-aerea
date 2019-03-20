package it.begear.CompagniaAerea.Main;

import java.util.ArrayList;
import java.util.List;

import it.begear.CompagniaAerea.Model.Aereo;
import it.begear.CompagniaAerea.Model.Cliente;
import it.begear.CompagniaAerea.Model.Prenotazione;
import it.begear.CompagniaAerea.Model.Volo;
import it.begear.CompagniaAerea.dao.DAO;
import it.begear.CompagniaAerea.dao.DAOImpl;

public class Main {

	public static void main(String[] args) {
		DAO dao= DAOImpl.getInstance();
		
//Esempio d'uso
		Cliente cliente= dao.read(Cliente.class, "mario.rossi");
		Volo volo=dao.read(Volo.class, 5);


		
//		dao.create(cliente.aggiungiVolo(volo));
//		dao.create(volo.aggiungiCliente(cliente, "55B", "economy" ));
	
	
	}

}
