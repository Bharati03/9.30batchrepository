package Pkg3;

public class Constructor {
	public Constructor()
	{
		
		System.out.println("Default constructor");
	}
	
	public Constructor(int a)
	{
		this(1,2);
		System.out.println("One Parameterized constructor");
	}
	
	public Constructor(int a, int b)
	{
		//this(1,2);
		System.out.println("Two Parameterized constructor");
	}
	
	public Constructor(int a, int b, int c)
	{
		//this(1,2,3);
		System.out.println("Three Parameterized constructor");
	}
	
	
	
	public static void main (String[] args)
	{
		Constructor xyz = new Constructor(22);
	}

}
