package jahr2024.tag01;

import jahr2024.alle_tage.DateiLeser;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Tag01
{
	private final List<Integer> ersteSpalteSortiert;
	private final List<Integer> zweiteSpalteSortiert;
	public Tag01(String pfad) throws IOException
	{
		DateiLeser input = new DateiLeser(pfad);
		input.wandleSpaltenZuZweiListen("   ");
		ersteSpalteSortiert = input.getErsteSpalteSortiertNachZahlenwert();
		zweiteSpalteSortiert = input.getZweiteSpalteSortiertNachZahlenwert();
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

	public Integer getAehnlichkeitsgrad()
	{
		Integer aehnlichkeitsgrad = 0;
		for(Integer zahl : ersteSpalteSortiert)
		{
			aehnlichkeitsgrad += Collections.frequency(zweiteSpalteSortiert, zahl) * zahl;
		}

		return aehnlichkeitsgrad;
	}
}
