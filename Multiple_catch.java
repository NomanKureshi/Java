//multiple catch
class Multiple_catch
{
	public static void main(String []args)
	{
		try
		{
			int a = 10/0;
			int [] arr = new int[3];
			arr [5] = 90;
			System.out.print(a);
		}
		catch(ArithmeticException e)
		{
			System.out.print("problem occured");
		}
		catch(ArrayIndexOutOfBoundsException s)
		{
			System.out.print("problem arise");
		}
	}
}