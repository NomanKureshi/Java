interface A
{
	void display();
}
class B implements A
{	
	public void display()
	{
		System.out.print(" inheritance method\n");
	}
	void two(){System.out.print(" b-two\n");}
}
class C extends B
{
	void three(){System.out.print(" c-three");}
}
class De
{
	public static void main(String[]a)
	{
		B b=new B();
		b.two();
		b.display();
		C c=new C();
		c.three();
	}
}	