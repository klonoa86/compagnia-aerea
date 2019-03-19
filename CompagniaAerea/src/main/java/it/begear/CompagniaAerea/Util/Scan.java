package it.begear.CompagniaAerea.Util;

import java.util.Scanner;

import org.apache.log4j.Logger;

import it.begear.CompagniaAerea.Main.Main;

public class Scan {
	
	public static int scannerInteri() {
		Logger log=Logger.getLogger(Main.class);
		Scanner myInt = new Scanner(System.in);

		if (myInt.hasNextInt()) {
			return myInt.nextInt();
		}
		log.warn("Non  hai inserito un intero.Riprova!");
		String svuota = myInt.nextLine();
		return scannerInteri();

	}

	public static String scannerString() {
		Scanner myString = new Scanner(System.in);
		String scannerStringa = myString.nextLine();
		return scannerStringa;
	}

}
