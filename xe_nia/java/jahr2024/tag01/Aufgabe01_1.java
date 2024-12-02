package jahr2024.tag01;

import jahr2024.alle_tage.DateiLeser;

import java.io.IOException;
import java.util.List;

public class Aufgabe01_1
{
	private final List<Integer> ersteSpalteSortiert;
	private final List<Integer> zweiteSpalteSortiert;
	public Aufgabe01_1(String pfad) throws IOException
	{
		DateiLeser input = new DateiLeser(pfad);
		input.wandleSpaltenZuZweiListen("   ");
		ersteSpalteSortiert = input.getErsteSpalteSortiert();
		zweiteSpalteSortiert = input.getZweiteSpalteSortiert();
	}

	public Integer getGesamtenAbstand()
	{
		Integer gesamterAbstand = 0;
		for(int i = 0; i < ersteSpalteSortiert.size(); i++)
		{
			gesamterAbstand += Math.abs(ersteSpalteSortiert.get(i) - zweiteSpalteSortiert.get(i));
		}

		return gesamterAbstand;
	}
}
