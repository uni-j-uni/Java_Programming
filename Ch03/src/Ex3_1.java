
public class Ex3_1 {
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