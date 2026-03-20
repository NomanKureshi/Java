//basic program for thread using interface runnable
class pqr implements Runnable
{
	public void run()
	{
		String str = "thread running";
		System.out.print(str);
	}
}
class xyz 
{
	public static void main(String []args)
	{
		pqr p =new pqr();
		p.run();
	}
} 