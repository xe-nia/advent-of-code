package jahr2024.alle_tage;

import jahr2024.tag01.Tag01;
import jahr2024.tag02.Tag02;
import jahr2024.tag11.Tag11;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		//Tag 1:
		Tag01 tag01 = new Tag01("./inputs/tag01.txt");
		System.out.println("Tag 1, Aufgabe 1: " + tag01.getGesamtenAbstand());
		System.out.println("Tag 1, Aufgabe 2: " + tag01.getAehnlichkeitsgrad());
		System.out.println("-----------------------------------------------");

		//Tag 2:
		Tag02 tag02 = new Tag02("./inputs/tag02.txt");
		System.out.println("Tag 2, Aufgabe 1: " + tag02.getAnzahlSichererReports());
		System.out.println("Tag 2, Aufgabe 2: " + tag02.getAnzahlSichererReportsMitDaempfung());
		System.out.println("-----------------------------------------------");

		//Tag 11:
		Tag11 tag11 = new Tag11();
		tag11.blink25Times();
		System.out.println("Tag 11, Aufgabe 1: " + tag11.countStonesAfter25Blinks());

	}
}
