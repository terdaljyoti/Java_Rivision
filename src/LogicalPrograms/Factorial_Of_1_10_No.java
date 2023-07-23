package LogicalPrograms;

public class Factorial_Of_1_10_No 
{

	public static void main(String[] args)
	{
		int fact;
		for(int i=1;i<=10;i++)
		{
			 fact=1;
			for(int j=1;j<=i;j++)
			{
				fact=fact*j;
			}
			
			System.out.println("factorial of "+i+" is "+fact);
		}
	
	}
}
