package Pkg4;

public class Class12Mar
{
	public Class12Mar()
	{
		this(1,2,3,4);
		System.out.println("Default constructor");
	}
	
	public Class12Mar(int a)
	{
		this(5,6,7);
		System.out.println("one parameterized constructor");
	}
	
	public Class12Mar(int b, int c)
	{
		this();
		System.out.println("two parameterized constructor");
	}
	
	public Class12Mar(int d, int e, int f)
	{
		this(8,9);
		System.out.println("three parameterized constructor");
	}
	
	public Class12Mar(int g, int h, int i, int j)
	{
		System.out.println("four parameterized constructor");
	}
	
	public static void main (String[] args)
	{
		Class12Mar abc = new Class12Mar(1);
	}

}
