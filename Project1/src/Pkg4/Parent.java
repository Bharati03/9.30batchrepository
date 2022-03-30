package Pkg4;

public class Parent {
	public Parent()
	{
		System.out.println("Parent Default constructor");
	}
	
	public Parent(int a)
	{
		this(1,2,3);
		System.out.println("Parent one parameterised constructor");
	}
	
	public Parent(int b, int c)
	{
		this();
		System.out.println("Parent two parameterised constructor");
	}
	
	public Parent(int d, int e, int f)
	{
		this(4,5);
		System.out.println("Parent three parameterised constructor");
	}
	
	

}
