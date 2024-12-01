package jahr2024.alle_tage;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateiLeser {

	private ArrayList<String> ersteSpalte;
	private ArrayList<String> zweiteSpalte;

	public DateiLeser(String pfad) throws IOException
	{
		this.ersteSpalte = new ArrayList<>();
		this.zweiteSpalte = new ArrayList<>();
		liesDatei(pfad);
	}
	private void liesDatei(String pfad) throws IOException
	{
		File datei = new File(pfad);
		BufferedReader bufferedReader = new BufferedReader(new FileReader(datei));
		wandleSpaltenZuZweiListen(bufferedReader, "\t");
	}

	public void wandleSpaltenZuZweiListen(BufferedReader bufferedReader, String trenner) throws IOException
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

	public List<Integer> getErsteSpalte(ArrayList<String> ersteSpalte)
	{
		return getSpalte(ersteSpalte);
	}

	public List<Integer> getZweiteSpalte(ArrayList<String> zweiteSpalte)
	{
		return getSpalte(zweiteSpalte);
	}

	private List<Integer> getSpalte(ArrayList<String> spalte)
	{
		return spalte.stream().map(Integer::parseInt).collect(Collectors.toList());
	}

	public List<Integer> getErsteSpalteSortiert(ArrayList<String> ersteSpalte)
	{
		return getSpalteSortiert(ersteSpalte);
	}

	public List<Integer> getZweiteSpalteSortiert(ArrayList<String> zweiteSpalte)
	{
		return getSpalteSortiert(zweiteSpalte);
	}

	private List<Integer> getSpalteSortiert(ArrayList<String> spalte)
	{
		return spalte.stream().map(Integer::parseInt).sorted().collect(Collectors.toList());
	}
}
