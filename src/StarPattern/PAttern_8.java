package StarPattern;

public class PAttern_8 
{
	/*
	 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 

	 */
	
	public static void main(String[] args)
	{
		/*
		for(int i=1;i<=5;i++)
		{
			//space
			for(int j=2;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=5;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		*/
		int space=0,star=5;
		for(int i=1;i<=5;i++)
		{
			//space
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
			star--;
			space++;
		}
	}

}
