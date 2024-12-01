package jahr2024.tag01.puzzle01;

import jahr2024.alle_tage.DateiLeser;

import java.io.IOException;
import java.util.List;

public class Puzzle01
{
	private final List<Integer> ersteSpalteSortiert;
	private final List<Integer> zweiteSpalteSortiert;
	public Puzzle01(String pfad) throws IOException
	{
		DateiLeser input = new DateiLeser("");
		ersteSpalteSortiert = input.getErsteSpalteSortiert();
		zweiteSpalteSortiert = input.getZweiteSpalteSortiert();
	}

	private Integer getGesamtenAbstand(List<Integer> ersteSpalteSortiert, List<Integer> zweiteSpalteSortiert)
	{
		Integer gesamterAbstand = 0;
		for(int i = 0; i < ersteSpalteSortiert.size(); i++)
		{
			gesamterAbstand += Math.abs(ersteSpalteSortiert.get(i) - zweiteSpalteSortiert.get(i));
		}

		return gesamterAbstand;
	}
}
