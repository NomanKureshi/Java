//finally
class Finally
{
	public static void main(String []args)
	{
		try
		{
			int a = 10/0;
			System.out.print(a);
		}
		catch(ArithmeticException e)
		{
			System.out.print("problem occured" + e);
			
		}
		finally
		{
			System.out.print(" Finally block always executes ");
		}
	}
}	