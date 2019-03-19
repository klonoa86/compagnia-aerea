package it.begear.CompagniaAerea.Util;

import java.util.Scanner;

public class Scan {

	public static int scannerInteri() {
		Scanner myInt = new Scanner(System.in);

		if (myInt.hasNextInt()) {
			return myInt.nextInt();
		}
		System.out.println("Errore inserisci un numero! ");
		String svuota = myInt.nextLine();
		return scannerInteri();

	}

	public static String scannerString() {
		Scanner myString = new Scanner(System.in);

		String scannerStringa = myString.nextLine();
		return scannerStringa;
	}

}
