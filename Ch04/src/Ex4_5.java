import java.util.*;

public class Ex4_5 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input N : ");
		int n = sc.nextInt();
		IPhone [] iphone = new IPhone[n];
		
		for (int i = 0; i < n; ++i)
			iphone[i] = new IPhone("IPhone 14 Pro MAX", "가로 77.6mm, 세로 160.7mm", 2022);
		
		for (int i = 0; i < iphone.length; ++i)
			iphone[i].poweron();
		
		sc.close();
	}
}
