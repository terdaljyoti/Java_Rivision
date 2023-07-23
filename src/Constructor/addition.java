package Constructor;

public class addition
{
	int num1,num2;
	addition()
	{
		num1=10;
		num2=20;
	}
	addition(int a,int b)
	{
		num1=a;
		num2=b;
	}
	
	public void sum()
	{
	
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) 
	{
	
		addition a1=new addition();
		a1.sum();
		
		addition a2=new addition(40, 50);
		a2.sum();
	}
}
