package StarPattern;

public class Pattern_6 
{
	/*		*********
	 * 		 *******
	 * 		  *****
	 * 		   ***
	 * 			*
	 * 
	 */
	public static void main(String[] args) 
	{
		int space=0,star=9;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=star;j++)
			{
				System.out.print("*");
			}
			star=star-2;
			space++;
			System.out.println();
		}
	}
}
