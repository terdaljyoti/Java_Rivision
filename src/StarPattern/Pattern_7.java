package StarPattern;

public class Pattern_7 
{
/*	 *   
    * *
   * * *
  * * * *
 * * * * *

	  
	 */

	public static void main(String[] args)
	{/*
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		*/int space=4,star=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print(" *");
			}
			space--;
			star++;
			System.out.println();
			
		}
	}
}
