abstract class Book
{
	 public abstract void page();
}
public  class S extends Book
{
	public void page()
	{
		System.out.print("OLD");
	}
	public static void main(String[] args)
	{
		Book obj = new S();
		obj.page();
	}
}