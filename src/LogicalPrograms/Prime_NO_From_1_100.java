package LogicalPrograms;

public class Prime_NO_From_1_100
{

	public static void main(String[] args)
	{	int count;
		for(int i=1;i<=100;i++)
		{
			count=0;
			for(int j=2;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			
			if(count==1)
			{
				System.out.println(i);
			}
		}
	}
}
