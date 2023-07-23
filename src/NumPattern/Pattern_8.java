package NumPattern;

public class Pattern_8
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
		int space=0,no=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=no;j++)
			{
				System.out.print(i);
			}
			no--;
			space++;
			System.out.println();
			
		}
	}
}
