//constructor overloading
class Circles{
	String model;
	int year;
	Circles(){
		year=2006;
		model="alpha";
	}
	Circles(int year){
		this.year=year;
		model="beta";
	}
	Circles(int year,String model){
		this.year=year;
		this.model=model;
	}
	void display(){
		System.out.println("year=="+year+"model=="+model);
	}
	public static void main(String[]args){
		Circles c1=new Circles();
		Circles c2=new Circles(2007);
		Circles c3=new Circles(2008,"gamma");
		c1.display();
		c2.display();
		c3.display();
	}
}