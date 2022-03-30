package Pkg2;



//(((((10+2)+2)-2)*2)/2)
public class Class2Assignment1 {
	
	public int sum(int a, int b)
	{
		int c= a+b;
		System.out.println("Sum of two inputs  = " + c);
		return c;
	}
	public int sub(int a, int b)
	{
		int c=a-b;
		System.out.println("Sub of two inputs = " + c);
		return c;
	}
	public int multi(int a, int b)
	{
		int c= a*b;
		System.out.println("Multi of two inputs = " + c);
		return c;
	}
	
	public void div (int a, int b)
	{
		int c= a/b;
		System.out.println("Final Result of two inputs = " + c);
	}
	public static void main (String[] args)
	{
		Class2Assignment1 ans = new Class2Assignment1();
		int sumResult = ans.sum(10, 2);
		int sumResult2 =ans.sum(sumResult, 2);
		int SubResult =ans.sub(sumResult2, 2);
		int MultiResult = ans.multi(SubResult, 2);
		ans.div(MultiResult, 2);
		
	}

}
