package it.begear.CompagniaAerea.Util;

import java.util.Scanner;

public class Menu {

	public static void entraEsci() {
		int n;
		int a;
		System.out.println("1. compra biglietto");
		System.out.println("2. esci");
		System.out.println("3. verifica lo stato di un volo");
		System.out.println("4. prenotazioni effettuate");
		System.out.println("5. modifica prenotazione");
		System.out.println("6. cancella prenotazione");

		n = Scan.scannerInteri();
		switch (n) {
		case 1:
			// esempio
			System.out.println("");
			break;

		case 2:
			// esempio
			System.out.println("");
			break;

		case 3:
			controlloVolo();
		case 4:
			// esempio
		}
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
}
