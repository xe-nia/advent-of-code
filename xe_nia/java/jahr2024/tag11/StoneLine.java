package jahr2024.tag11;

import java.util.LinkedList;

public class StoneLine
{
	LinkedList<Stone> stones;

	public StoneLine(LinkedList<Stone> stones)
	{
		this.stones = stones;
	}

	public long countStonesInLine()
	{
		return stones.size();
	}

	public LinkedList<Stone> getStones()
	{
		return stones;
	}

	private void setStones(LinkedList<Stone> stones)
	{
		this.stones = stones;
	}

	public void blink()
	{
		LinkedList<Stone> newStones = new LinkedList<>(stones);
		for (Stone stone : stones)
		{
			newStones.addAll(stone.change().getStones());
		}

		setStones(newStones);
	}
}
