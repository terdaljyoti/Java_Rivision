package NumPattern;

public class Pattern_3 
{
	/* 
	  
	 11111  
	 2222  
	 333  
	 44  
	 5
	   
	 */
	public static void main(String[] args)
	{
		int no=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=no;j++)
			{
				System.out.print(i);
			}
			
			no--;
			System.out.println();
		}
	}
}
