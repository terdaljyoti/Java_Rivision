package LogicalPrograms;

public class Check_Prime_No
{

	public static void main(String[] args)
	{
		int no=12,count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(no+" is prime no");
		}
		else
		{
			System.out.println(no+" is not prime no");
		}
	}
}
