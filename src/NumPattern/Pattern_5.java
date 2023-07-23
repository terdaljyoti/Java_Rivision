package NumPattern;

public class Pattern_5 
{
	/*
	  	54321
	  	54312
	  	54123
	  	51234
	  	12345
	 */

	public static void main(String[] args)
	{
		
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(j);
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(k);
			}
			System.out.println();
		}
	}
}
