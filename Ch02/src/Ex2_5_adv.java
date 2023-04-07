import java.util.Scanner;

public class Ex2_5_adv {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input start number(0~6) : ");
		int blank = sc.nextInt();
		sc.close();
		
		System.out.println("일 월 화 수 목 금 토");
		for (int i = 0; i < blank; i++)
			System.out.print(" ");
		
		for (int i = 1; i <= 31; ++i)
		{
			System.out.print(i + " ");
			if ((i + blank) % 7 == 0)
				System.out.println();
		}
	}
}
