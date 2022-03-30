package Pkg1;

public class Student {

	int age;
	int rollno;
	
	public void display1()
	{
		System.out.println("Wel come to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main (String[] args)
	{
		Student obj=new Student();
		obj.display1();
		obj.display2();
		obj.age =12;
		obj.rollno=1234;
		System.out.println(obj.age);
		System.out.println(obj.rollno);
	}
}
