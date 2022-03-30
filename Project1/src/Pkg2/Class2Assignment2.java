package Pkg2;

public class Class2Assignment2 {
	//(((((10/2)-2)+2)-2)*2)
	
	public int div (int a, int b)
	{
		int c= a/b;
		System.out.println("Division of two numbers =" + c);
		return c;
	}
	
	public int sub (int a, int b)
	{
		int c= a-b;
		System.out.println("Substraction of two numbers =" + c);
		return c;
	}
	public int sum (int a, int b)
	{
		int c= a+b;
		System.out.println("Sum of two numbers =" + c);
		return c;
	}
	public void multi(int a, int b)
	{
		int c= a*b;
		System.out.println("Final Result =" + c);
	}
	public static void main(String[] args)
	{
		Class2Assignment2 ans = new Class2Assignment2();
		int divResult = ans.div(10, 2);
		int subResult = ans.sub(divResult, 2);
		int sumResult = ans.sum(subResult, 2);
		int subResult2 = ans.sub(sumResult, 2);
		ans.multi(subResult2, 2);
		
	}
    

}
