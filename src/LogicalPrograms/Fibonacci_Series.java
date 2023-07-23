package LogicalPrograms;

public class Fibonacci_Series 
{

	public static void main(String[] args)
	{
	
		int first=0,second=1,next,count=10;
		
		System.out.print(first+" "+second+" ");
		for(int i=2;i<=count;i++)
		{
			next=first+second;
			System.out.print(next+" ");
			first=second;
			second=next;
		}
	}
}
