import java.util.*;

public class Ex3_5 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int Grades[] = new int[3], i = 0, sum = 0;

		System.out.print("국어, 영어, 수학 점수를 차례로 입력하세요 : ");

		while (i < Grades.length)
		{
			try
			{	
				for (; i < Grades.length; ++i)
					Grades[i] = sc.nextInt();
			}
			catch(InputMismatchException e)
			{
				System.out.println("정수가 아닌 문자가 입력 되었습니다. 다시 입력해주세요.");
				//e.printStackTrace();
				sc.next();
				continue;
			}
			for (i = 0; i < Grades.length; ++i)
				sum += Grades[i];
			System.out.printf("세 과목 점수의 평균점수는 : %d점 입니다.", sum / Grades.length);
		}
		sc.close();		
	}
}