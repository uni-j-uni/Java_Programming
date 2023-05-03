
public class Triangle extends Shape {
	public Triangle(int x1, int y1, int x2, int y2)
	{
		super(x1, y1, x2, y2);
	}
	public double getArea()
	{
		return (this.x2 - this.x1) * (this.y2 - this.y1) / 2;
	}
}
