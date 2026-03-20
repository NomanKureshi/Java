class vehicle
{
	void run()
	{
		System.out.println("vehicle is runing");
	}
}
class Bike extends vehicle
{
	void run()
	{
		System.out.println("Bike is runing safely");
	}
}
public class main
{
	public static void main(String[]args)
	{
		vehicle v=new vehicle();
		v.run();
		Bike obj=new Bike();
		obj.run();
	}
}