//Scanner
import java.util.Scanner;

public class Ex2_3
{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("What's your name? : ");
		String name = scanner.nextLine();
		
		System.out.println("What's " + name + "'s age : ");
		int age = scanner.nextInt();
		
		scanner.close();
		System.out.println(name + " will be " + age + " next year.");
	}
}