class person 
{
	private String name;
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname(){return name;}
}
	public class Main
	{
		public static void main(String[]args)
		{
			person P=new person();
			P.setname("alice");
			System.out.print(P.getname());
		}
	}
