class son
{
	void Role()
	{
		System.out.println("base class");
	}
}
class Father extends son{
	void Role()
	{
		System.out.println("derived class");
	}
}
class polymorphism
{
	public static void main(String[] nk)
	{
		Father obj= new Father();
		obj.Role();
	}
}