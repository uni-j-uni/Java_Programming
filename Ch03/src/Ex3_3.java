import java.util.Scanner;

public class Ex3_3 {
	public static int sum(int n)
	{
		int result = 0;
		for (int i = 1; i <= n; ++i)
			result += i;
		
		return result;
	}	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input number : ");
		int n = sc.nextInt();
		sc.close();
		
		System.out.println("1부터 " + n + "까지의 합계는 " + sum(n) + "입니다.");
	}
}