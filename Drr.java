interface A
{
	void display();
}
class B implements A
{
	public void display()
	{
		System.out.println("interface method display");
	}
}
class C extends B
{
	void three()
	{
		System.out.println("C-three");
	}
}
class Drr
{
	public static void main(String[]a)
	{
		B b=new B();
		b.display();
		C c=new C();
		c.three();
	}
}