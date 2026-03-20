class Helper 
{
	public static int sum(int a,int b)
	{
		return a+b;
	}
}

class Vk
{
	public static void main(String[] args)
	{
		Helper h=new Helper();
		int a=h.sum(20,80);
		System.out.print("sum is:"+a);
	}
}