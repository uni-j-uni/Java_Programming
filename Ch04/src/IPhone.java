
public class IPhone {
	String ModelName, Size;
	int YearOfRelease;
	
	public IPhone(String name, String size, int year)
	{
		ModelName = name;
		Size = size;
		YearOfRelease = year;
	}
	public IPhone()
	{
		System.out.println("IPhone 객체가 생성됨");
	}
	public void poweron()
	{
		System.out.println("poweron()");
	}
	public void poweroff()
	{
		System.out.println("poweroff()");
	}
	public void run_application()
	{
		System.out.println("run_application()");
	}
}
