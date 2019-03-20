package it.begear.CompagniaAerea.Util;

import it.begear.CompagniaAerea.Model.Aereo;
import it.begear.CompagniaAerea.Model.Cliente;
import it.begear.CompagniaAerea.Model.Prenotazione;
import it.begear.CompagniaAerea.Model.Volo;
import it.begear.CompagniaAerea.dao.DAO;
import it.begear.CompagniaAerea.dao.DAOImpl;

public class Menu {

	public static DAO mioDao = DAOImpl.getInstance();
	// public static Aereo aereo = new Aereo("ab1234", "airfrance", 23, 40, 0);
	// public static Volo mioVolo = new Volo(123,"22/03/2019",
	// "22/03/2019","Barcellona", "Roma", aereo );
	// public static Cliente mioCliente = new Cliente("Pippo",
	// "Baudo","abcde44","pippobaudo");
	// public static Prenotazione miaPrenotazione = new Prenotazione(mioCliente,
	// mioVolo, "2C", "Economy");

	public static void crudPrenotazione() {
		int n;
		System.out.println("0. Visualizza voli");
		System.out.println("1. crea una prenotazione");
		System.out.println("2. modifica prenotazione");
		System.out.println("3. prenotazioni effettuate");
		System.out.println("4. cancella prenotazione");
		System.out.println("5. esci");

		n = Scan.scannerInteri();
		switch (n) {
		
		case 0:
			
		
		case 1:
			System.out.println("dimmi i dati del cliente");

			String nome = Scan.scannerString();
			String cognome = Scan.scannerString();
			String cf = Scan.scannerString();
			String username = Scan.scannerString();
			Cliente cliente = new Cliente(nome, cognome, cf, username);
			mioDao.create(cliente);
			cliente.prenota();
			System.out.println("Hai creato una Prenotazione");
			break;

		case 2:

			System.out.println("dammi l'id  del volo della prenotazione da modificare");
			int k = Scan.scannerInteri();
			System.out.println("dammi l'username del cliente che ha prenotato");
			String j = Scan.scannerString();
			Prenotazione prenotazione = mioDao.read(Prenotazione.class, k);
			String nuovoPosto = Scan.scannerString();
			String nuovaClasse = Scan.scannerString();
			prenotazione.setPostoAssegnato(nuovoPosto);
			prenotazione.setClasse(nuovaClasse);
			mioDao.update(prenotazione);
			break;

		case 3:
			
			System.out.println("dammi l'id del volo della prenotazione da leggere");
			int i = Scan.scannerInteri();
			System.out.println("dammi l'username del cliente che ha prenotato");
			String h = Scan.scannerString();
			System.out.println(mioDao.read(Prenotazione.class, h));
			break;
			
		case 4:
			// esempio
			System.out.println("dammi l'id del volo della prenotazione da cancellare");
			int g = Scan.scannerInteri();
			Prenotazione prenotazione2 = mioDao.read(Prenotazione.class, g);
			mioDao.delete(prenotazione2);
			break;
			
		case 5:
			esci();
			break;
			
		default:
			System.out.println("valore errato");
			crudPrenotazione();
			break;
		}
		crudPrenotazione();
	}

	
	public static void esci() {
		System.out.println("Arrivederci");
		System.exit(0);
	}
	public static void controlloVolo() {
		int a;
		System.out.println("1. posti in business");
		System.out.println("2. posti in standard");
		System.out.println("3. posti in economy");
		System.out.println("4. partenza volo");
		System.out.println("5. arrivo previsto");
		a = Scan.scannerInteri();

		switch (a) {
		case 1:
			// esempio

			break;

		case 2:
			// esempio

			break;

		case 3:
			// esempio
			break;
		case 4:
			// esempio
			break;
		case 5:
			// esempio
			break;
		}

	}

	public static void menuCompagnia() {
		int a;
		System.out.println("1. visualizza clienti che hanno prenotato un volo");
		System.out.println("2. aggiungi volo");
		System.out.println("3. modifica volo");
		System.out.println("4. visualizza voli");
		System.out.println("5. cancella volo");
		a = Scan.scannerInteri();
		switch (a) {
		case 1:
			// prova

			break;

		case 2:
			// prova

			break;

		case 3:
			modificaVolo();

		}

	}

	public static void modificaVolo() {
		int a;

		System.out.println("1. modifica orari");
		System.out.println("2. modifica destinazione");
		System.out.println("3. modifica partenza");
		a = Scan.scannerInteri();

		switch (a) {
		case 1:
			// prova

			break;

		case 2:
			// prova

			break;

		}
	}

	// public void creaPrenotazione() {
	//
	// Volo volo = new Volo()
	// Prenotazione aggiungiVolo ()
	// }
}