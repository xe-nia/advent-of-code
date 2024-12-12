package jahr2024.tag11;


import java.util.LinkedList;

public class Stone {
	private final long number;

	public Stone(long number)
	{
		this.number = number;
	}

	public StoneLine change()
	{
		LinkedList<Stone> changedStone = new LinkedList<>();
		String numberAsString = String.valueOf(number);

		if(number == 0)
		{
			changedStone.add(new Stone(1));
		}
		else if(numberAsString.length() % 2 == 0)
		{
			changedStone.add(new Stone(Long.parseLong(numberAsString.substring(0, numberAsString.length()/2))));
			changedStone.add(new Stone(Long.parseLong(numberAsString.substring(numberAsString.length()/2))));
		}
		else
		{
			changedStone.add(new Stone(number * 2024));
		}

		return new StoneLine(changedStone);
	}
}
