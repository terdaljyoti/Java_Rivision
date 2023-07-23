package LogicalPrograms;

public class Factorial_OF_Given_No 
{

	public static void main(String[] args) 
	{
	
		int no=7,fact=1;
		for(int i=1;i<=no;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+no+" is :"+fact);
	}
}
