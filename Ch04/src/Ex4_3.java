
public class Ex4_3 {
	public static void main(String args[])
	{
		IPhone Series14;
		Series14 = new IPhone();
		Series14.ModelName = "IPhone 14 Pro MAX";
		Series14.Size = "가로 77.6mm, 세로 160.7mm";
		Series14.YearOfRelease = 2022;
		System.out.println("모델명 : " + Series14.ModelName);
		System.out.println("크기 : " + Series14.Size);
		System.out.println("출시년도 : " + Series14.YearOfRelease);
		Series14.poweron();
		Series14.poweroff();
		Series14.run_application();
	}
}
