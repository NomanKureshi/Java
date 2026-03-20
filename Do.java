class Abc implements Cloneable
{
	int x,y;
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
}
public class Do
{
	public static void main(String[] args)
	throws CloneNotSupportedException
	{
		Abc obj1 = new Abc();
		obj1.x = 200;
		obj1.y = 700;
		
		Abc obj2 = (Abc) obj1.clone();
		
		obj2.x = 800;
		System.out.print("obj1:" + obj1.x + " " +obj1.y + "\n");
		System.out.print("obj2:" + obj2.x +" "+obj2.y);		
	}
}