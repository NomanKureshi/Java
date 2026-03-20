//shallo object clone
class abc
{
		int i;
		int j;
		public String toString()
		{N
			return "abc i==" + i + " abc j==" + j;
		}
}
class clone
{
	public static void main(String[]args)
	{
		abc o=new abc();
		o.i=5;
		o.j=6;
		abc o1=o;
		o1.j=9;
		System.out.println(o);
		System.out.println(o1);
	}
}