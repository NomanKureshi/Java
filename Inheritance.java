class Car
{
	String name;
	public void speed()
	{
		System.out.println("speeding");
	}
}
class Alto extends Car
{
	public void display()
	{
		System.out.println("This is alto.class of display method");
	}
}
class Inheritance
{
	public static void main(String[] args)
	{
		Alto a= new Alto();
		a.name="swift";
		a.display();
		a.speed();
	}
}