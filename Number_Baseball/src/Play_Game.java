import java.util.*;

public class Play_Game {
	public static void main(String args[])
	{
		final int SIZE = 3;
		Scanner sc = new Scanner(System.in);
		int Computer[] = new int[SIZE], Guess[] = new int[SIZE];
		int count = 1;
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		for (int i = 0; i < SIZE; i++)
		{
			Computer[i] = random.nextInt(9) + 1;
			for (int j = 0; j < i; j++)
				if (Computer[i] == Computer[j])
					i--;
		}
		
		System.out.println("[Number Baseball]");
		while(true)
		{
			int strike = 0, ball = 0;
			
			System.out.println("-------------------------");
			System.out.printf("Guess %d numbers.\n", SIZE);
			
			for (int i = 0; i < SIZE; i++)
			{
				try
				{
					Guess[i] = sc.nextInt();
					if (Guess[i] > 9 || Guess[i] < 1)
					{
						sc = new Scanner(System.in);
						i = -1;
					}
				}
				catch(InputMismatchException e)
				{
					System.out.println("Entered value is not an Integer. Please enter it again.");
					System.out.println("-------------------------");
					System.out.printf("Guess %d numbers.\n", SIZE);
					sc = new Scanner(System.in);
					i = -1;
					continue;
				}
				if (i == -1)
				{
					System.out.println("Please enter numbers from 1 to 9.");
					System.out.println("-------------------------");
					System.out.printf("Guess %d numbers.\n", SIZE);
				}
			}
			for (int i = 0; i < SIZE; i++)
				for (int j = 0; j < SIZE; j++)
				{
					if (Computer[i] == Guess[j] && i == j)
						strike++;
					else if (Computer[i] == Guess[j])
						ball++;
				}
			
			if (strike == SIZE)
			{
				System.out.printf("%d strike.\n", strike);
				System.out.println("-------------------------");
				System.out.println("[Victory]");
				System.out.printf("You make it on %d tries.", count);
				sc.close();
				break;
			}
			else
			{
				System.out.println("-------------------------");
				System.out.print("Your Guess is [ ");
				for (int i = 0; i < SIZE; i++)
					System.out.printf("%d ", Guess[i]);
				System.out.printf("]\nYou get %d strike, %d ball.\n", strike, ball);
			}
			count++;
		}
	}
}
