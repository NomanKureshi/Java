class Student 
{
	String name="vishnu";
	int age=21;
	
	public String toString(){
	 
	  return "Student{name='"+name+"',age="+age+"}";
}
 
	public static void main(String[] args)
	{
		Student s= new Student();
		
		System.out.print(s.toString());
	}
}

