import java.util.Random;

public class DiceClass 
{
	
	
	public void RollDice(int sides)
	{
		Random rand = new Random();
		int answer = rand.nextInt(sides);
		System.out.println(answer);
	}


}
