package jahr2024.tag11;

import java.util.Arrays;
import java.util.LinkedList;

public class Tag11
{
	StoneLine stones;

	public Tag11()
	{
		stones = new StoneLine(new LinkedList<>(Arrays.asList(
				new Stone(814),
				new Stone(1183689),
				new Stone(0),
				new Stone(1),
				new Stone(766231),
				new Stone(4091),
				new Stone(93836),
				new Stone(46))));
	}

	public void blink25Times()
	{
		for(int i = 0; i < 4; i++)
		{
			stones.blink();
		}
	}

	public long countStonesAfter25Blinks()
	{
		return stones.countStonesInLine();
	}
}
