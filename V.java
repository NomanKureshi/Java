public class V
{
	{
		System.out.println("instance initialization block executed");
	}
	public V()
	{
		System.out.println("constructor executed");
	}
	public static void main(String[] args)
	{
		V obj1=new V();
		//V obj2=new V();
	}
}