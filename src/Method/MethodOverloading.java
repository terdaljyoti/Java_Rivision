package Method;

public class MethodOverloading 
{
	
	public void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	public void addition(double a,double b)
	{
		System.out.println(a+b);
	}
	public void addition()
	{
		int a=10,b=20;
		System.out.println(a+b); 
		
	}
	
	public static void main(String[] args)
	{
	
		MethodOverloading m1=new MethodOverloading();
		m1.addition();
		m1.addition(47.698, 3435.456);
		m1.addition(345, 9485);
		
	}
}
