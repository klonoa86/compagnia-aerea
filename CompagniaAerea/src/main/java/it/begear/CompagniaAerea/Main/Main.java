package it.begear.CompagniaAerea.Main;

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
		
		List<Volo> lista = dao.stampaListaVoliMondiali();
		for (Volo volo : lista) {
			System.out.println(volo);
		}
		
	}

}
