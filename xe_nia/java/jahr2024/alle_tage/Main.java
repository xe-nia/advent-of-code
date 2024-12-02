package jahr2024.alle_tage;

import jahr2024.tag01.Aufgabe01_1;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		//Tag 1, Aufgabe 1:
		Aufgabe01_1 aufgabe01_1 = new Aufgabe01_1("./inputs/puzzle01.txt");
		System.out.println(aufgabe01_1.getGesamtenAbstand());
	}
}
