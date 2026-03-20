final class Super
{
	int data=100;
}
class Sub extends Super
{
	public static void main(String[] args)
	{
		Sub o= new Sub();
		System.out.print(o.data);
	}
}