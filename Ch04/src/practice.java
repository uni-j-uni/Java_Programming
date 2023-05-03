

public class practice {
	public static void main(String args[])
	{
		for (int i = 'A'; i <= 'E'; ++i)
		{
			for (int j = i; j <= 'E'; ++j)
				System.out.print((char)j);
			System.out.println();
		}
	}
}