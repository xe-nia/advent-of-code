package jahr2024.alle_tage;

import jahr2024.tag01.Tag01;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		//Tag 1:
		Tag01 tag01_ = new Tag01("./inputs/tag01.txt");
		System.out.println(tag01_.getGesamtenAbstand());
		System.out.println(tag01_.getAehnlichkeitsgrad());
	}
}
