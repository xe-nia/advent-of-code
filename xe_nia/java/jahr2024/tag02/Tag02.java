package jahr2024.tag02;

import jahr2024.alle_tage.DateiLeser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Tag02
{
	private final List<List<Integer>> reports;
	public Tag02(String pfad) throws IOException
	{
		DateiLeser input = new DateiLeser(pfad);
		reports = input.getZeilen(" ");
	}

	public Integer getAnzahlSichererReports()
	{
		Integer anzahlSichererReports = 0;

		for(List<Integer> report : reports)
		{
			if(reportIstValide(report))
			{
				anzahlSichererReports++;
			}
		}

		return anzahlSichererReports;
	}

	public Integer getAnzahlSichererReportsMitDaempfung()
	{
		Integer anzahlSichererReports = 0;
		List<Integer> reportMitFehlendemLevel;

		for(List<Integer> report : reports)
		{
			if(reportIstValide(report))
			{
				anzahlSichererReports++;
				continue;
			}
			for(int i = 0; i < report.size(); i++)
			{
				reportMitFehlendemLevel = new ArrayList<>(report);
				reportMitFehlendemLevel.remove(i);
				if(reportIstValide(reportMitFehlendemLevel))
				{
					anzahlSichererReports++;
					break;
				}
			}
		}

		return anzahlSichererReports;
	}

	public boolean reportIstValide(List<Integer> report)
	{
		if(report.get(0).equals(report.get(1)))
		{
			return false;
		}

		return levelSindAufsteigend(report) ? report.get(0) < report.get(1) : levelSindAbsteigend(report);
	}

	private boolean levelSindAufsteigend(List<Integer> report)
	{
		for(int i = 0; i < report.size()-1; i++)
		{
			if(report.get(i).equals(report.get(i+1)))
			{
				return false;
			}
			if(report.get(i) > report.get(i+1))
			{
				return false;
			}
			if(report.get(i+1) - report.get(i) > 3)
			{
				return false;
			}
		}

		return true;
	}

	private boolean levelSindAbsteigend(List<Integer> report)
	{
		for(int i = 0; i < report.size()-1; i++)
		{
			if(report.get(i).equals(report.get(i+1)))
			{
				return false;
			}
			if(report.get(i) < report.get(i+1))
			{
				return false;
			}
			if(report.get(i) - report.get(i+1) > 3)
			{
				return false;
			}
		}

		return true;
	}
}
