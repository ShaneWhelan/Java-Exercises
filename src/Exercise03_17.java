import java.util.Scanner;
import java.util.Random;

public class Exercise03_17 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Choose an number to input:" + "\nScissor (0), Rock (1), Paper (2): ");
		int user = input.nextInt();
		
		Random rand = new Random();
		int comp = rand.nextInt(3);
		
		String userS = "";
		if(user == 0)
		{
			userS = "Scissor";
		}else if(user == 1)
		{
			userS = "Rock";
		}else if(user == 2)
		{
			userS = "Paper";
		}
		
		String compS = "";
		if(comp == 0)
		{
			compS = "Scissor";
		}else if(comp == 1)
		{
			compS = "Rock";
		}else if(comp == 2)
		{
			compS = "Paper";
		}

		String result = "The computer is " + compS + ". You are " + userS;
		if((user == 0 && comp == 2) || (user == 1 && comp == 0) || (user == 2 && comp == 1))
		{
			System.out.println(result + ". You win");
		}else if((user == 2 && comp == 0) || (user == 0 && comp == 1) || (user == 1 && comp == 2))
		{
			System.out.println(result + ". You lose");
		}else{
			System.out.println(result + ". It is a draw");
		}
	}
}