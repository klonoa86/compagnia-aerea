package it.begear.CompagniaAerea.Main;

import java.util.ArrayList;
import java.util.List;

import it.begear.CompagniaAerea.Model.Aereo;
import it.begear.CompagniaAerea.Model.Cliente;
import it.begear.CompagniaAerea.Model.Prenotazione;
import it.begear.CompagniaAerea.Model.Volo;
import it.begear.CompagniaAerea.Util.Menu;
import it.begear.CompagniaAerea.dao.DAO;
import it.begear.CompagniaAerea.dao.DAOImpl;

public class Main {

	public static void main(String[] args) {
<<<<<<< Updated upstream

		DAO dao = DAOImpl.getInstance();
		
=======
		DAO dao= DAOImpl.getInstance();
		Cliente cliente = new Cliente("ciao", "boh", "aber", "eroiu");
		
		cliente.prenota();
		
		
		
//Esempio d'uso
//		Cliente cliente= dao.read(Cliente.class, "mario.rossi");
//		Volo volo=dao.read(Volo.class, 5);

//Menu.crudPrenotazione();
>>>>>>> Stashed changes
		
		//esempio d'uso
//		List<Integer> lista = dao.stampaNumeroPrenotazioni();
//		System.out.println(lista);
	}

}
