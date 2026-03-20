class Book
{
	String title;
	Book(String title)
	{
		this.title=title;
	}
	public boolean equals(Object obj)
	{
		Book B=(Book) obj;
		return this.title.equals(B.title);
	}
	public static void main(String[]args)
	{
		Book b1=new Book("java");
		Book b2=new Book("java");
		System.out.print(b1.equals(b2));
	}
}