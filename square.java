import java.io.*;

class javacons{
	String name;
	int id;
	javacons(String name,int id)
	{
		this.name=name;
		this.id=id;
	}
	javacons(javacons obj2)
	{
		this.name=obj2.name;
		this.id=obj2.id;
	}
}
class square{
	public static void main(String[]args){
		javacons ob=new javacons("astha",68);
		System.out.println("Name:"+ob.name+"and Id:"+ob.id);
		javacons ob1=new javacons(ob);
		System.out.println("copy constructor used second object");
		System.out.println("Name:"+ob1.name+"and Id:"+ob1.id);
	}
}