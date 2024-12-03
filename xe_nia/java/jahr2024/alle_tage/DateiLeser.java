package jahr2024.alle_tage;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DateiLeser {

	private BufferedReader bufferedReader;
	private final ArrayList<String> ersteSpalte;
	private final ArrayList<String> zweiteSpalte;

	public DateiLeser(String pfad) throws IOException
	{
		ersteSpalte = new ArrayList<>();
		zweiteSpalte = new ArrayList<>();
		liesDatei(pfad);
	}
	private void liesDatei(String datei) throws IOException
	{
		bufferedReader = new BufferedReader(new FileReader(datei));
	}

	public void wandleSpaltenZuZweiListen(String trenner) throws IOException
	{
		String[] getrennteZeile;

		String zeile;
		while((zeile = bufferedReader.readLine()) != null)
		{
			getrennteZeile = zeile.split(trenner);
			ersteSpalte.add(getrennteZeile[0]);
			zweiteSpalte.add(getrennteZeile[1]);
		}
	}

	public List<List<Integer>> getZeilen(String trenner) throws IOException
	{
		List<List<Integer>> zeilen = new ArrayList<>();
		List<String> getrennteZeile;

		String zeile;
		while((zeile = bufferedReader.readLine()) != null)
		{
			getrennteZeile = new ArrayList<>(Arrays.asList(zeile.split(trenner)));
			zeilen.add(wandleElementeZuZahlen(getrennteZeile));
		}

		return zeilen;
	}

	public List<Integer> getErsteSpalte()
	{
		return wandleElementeZuZahlen(ersteSpalte);
	}

	public List<Integer> getZweiteSpalte()
	{
		return wandleElementeZuZahlen(zweiteSpalte);
	}

	private List<Integer> wandleElementeZuZahlen(List<String> spalte)
	{
		return spalte.stream().map(Integer::parseInt).collect(Collectors.toList());
	}

	public List<Integer> getErsteSpalteSortiertNachZahlenwert()
	{
		return getSpalteSortiertNachZahlenwert(ersteSpalte);
	}

	public List<Integer> getZweiteSpalteSortiertNachZahlenwert()
	{
		return getSpalteSortiertNachZahlenwert(zweiteSpalte);
	}

	private List<Integer> getSpalteSortiertNachZahlenwert(ArrayList<String> spalte)
	{
		return spalte.stream().map(Integer::parseInt).sorted().collect(Collectors.toList());
	}
}
