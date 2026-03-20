class A
{
	A()
	{
		System.out.println("class A's constructor is invoked");
	}
}
class B extends A
{
	B()
	{
		System.out.println("class B's constructor is invoked");
	}
}
public class Driverr
{
	public static void main(String[]args)
	{
		B obj=new B();
	}
}