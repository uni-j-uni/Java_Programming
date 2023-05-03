
public class Ex5_1 {
	public static void main(String args[])
	{
		Rectangle r = new Rectangle(0, 0, 100, 100);
		Triangle t = new Triangle(0, 0, 100, 100);
		
		System.out.println("Width : " + r.width);
		System.out.println("Height : " + r.height);
		System.out.println("Rectangle : " + r.getArea());
		System.out.println("Triangle : " + t.getArea());
	}	
}
