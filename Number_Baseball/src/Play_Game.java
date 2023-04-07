import java.util.*;

public class Play_Game {
	public static void main(String args[])
	{
		final int SIZE = 3;
		Scanner sc = new Scanner(System.in);
		int computer[] = new int[SIZE], Guess[] = new int[SIZE];
		int count = 0;
		
		Random random = new Random();
		random.setSeed(System.currentTimeMillis());
		
		for (int i = 0; i < SIZE; i++)
		{
			computer[i] = random.nextInt(9) + 1;
			for (int j = 0; j < i; j++)
				if (computer[i] == computer[j])
					i--;
		}
		
		System.out.println("[Number Baseball]");		
		while(true)
		{
			int strike = 0, ball = 0;
			
			System.out.println("-----------------");
			System.out.printf("Guess %d numbers.\n", SIZE);
			
			for (int i = 0; i < SIZE; i++)
				Guess[i] = sc.nextInt();
			
			for (int i = 0; i < SIZE; i++)
				for (int j = 0; j < SIZE; j++)
				{
					if (computer[i] == Guess[j] && i == j)
						strike++;
					else if (computer[i] == Guess[j])
						ball++;
				}
			
			if (strike == 3)
			{
				System.out.printf("%d strike.\n\n", strike);
				System.out.printf("You make it on %d tries.", count);
				sc.close();
				break;
			}
			else
				System.out.printf("%d strike, %d ball\n", strike, ball);
			
			count++;
		}
	}
}
