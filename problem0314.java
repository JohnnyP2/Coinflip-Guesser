import java.util.*;
public class problem0314 
{

	public static void main(String[] args) 
	{
		int coin = ((int) + (Math.random() * 2));
		Scanner key = new Scanner(System.in);
		System.out.println("Heads or Tails?");
		String guess = key.next();
		int answer = 0;
		
		if(guess.equalsIgnoreCase("heads"))
		{
			answer = 0;
		}
		else if(guess.equalsIgnoreCase("tails"))
		{
			answer = 1;
		}
		else
		{
			System.out.println("Incorrect Guess format");
		}
		
		if(coin == answer) 
		{
			System.out.println("Correct!");
		}
		else
		{
			System.out.println("Incorrect!");
		}
		
		
		
		

	}

}
