public class Cat
{
	int age;
	String name;
	static int population = 0;
	
	public Cat()
	{
		this(1, "Leo");
	}
	public Cat(int age)
	{
		this(age, "Leo");
	}
	public Cat(int age, String name)
	{
		System.out.println("A Cat Born!");
		++population;
	}
	public void speak()
	{
		System.out.println("Meow!\n");
	}
	public static void printPopulation()
	{
		System.out.printf("There %d Cats in here!\n", population);
	}
}