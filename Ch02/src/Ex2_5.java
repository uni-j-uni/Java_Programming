
public class Ex2_5 {
	public static void main(String args[])
	{
		for (int i = 0; i < 100; ++i)
		{
			if (i % 10 == 0)
				System.out.println();   // 10개마다 개행문자
			System.out.print(i + " ");
		}
	}
}
