
public class Ex4_7 {
	public static void main(String args[])
	{
		Cat [] cats = new Cat[3];
		
		for (int i = 0; i < cats.length; ++i)
		{
			cats[i] = new Cat();
			cats[i].speak();
		}
		Cat.printPopulation();
	}
}
