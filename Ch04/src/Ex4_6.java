class Calc
{
	public int sum(int a, int b)
	{
		return a + b;
	}
	public double sum(double a, double b)
	{
		return a + b;
	}
}
public class Ex4_6 {	
	public static void main(String args[])
	{
		Calc calc = new Calc();
		
		System.out.printf("Result1 = %d\n", calc.sum(1, 1));
		System.out.printf("Result2 = %f\n", calc.sum(2.0, 3.0));
		System.out.printf("Result3 = %f\n", calc.sum(1, 2.0));
	}	
}
