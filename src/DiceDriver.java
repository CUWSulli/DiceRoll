import java.util.Random;

public class DiceDriver 
{
	public static void main(String[] args)
	{
		RollDice(20);
		
	}
	public static void RollDice(int sides)
	{
		Random rand = new Random();
		int answer = rand.nextInt(sides);
		System.out.println(answer);
	}


















}
