package jahr2024.alle_tage;

import jahr2024.tag01.puzzle01.Puzzle01;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {

		//Tag 1, Puzzle 1:
		Puzzle01 puzzle01 = new Puzzle01("./inputs/puzzle01.txt");
		System.out.println(puzzle01.getGesamtenAbstand());
	}
}
