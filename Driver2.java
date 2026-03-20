class A
{
	A()
	{
		System.out.print(" class A's constructor is invoked");
	}
}
class B extends A
{
	B()
	{
		System.out.print(" class B's constructor invoked");
	}
}
class C extends B
{
	C()
	{
		System.out.print(" class c's constructor is invoked");
	}
}
public class Driver2
{
	public static void main(String[]args)
	{
		C obj=new C();
	}		
}