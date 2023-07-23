package NumPattern;

public class Pattern_6
{/*
	  1
	 22
	333
   4444
  55555
	
	 */
	public static void main(String[] args)
	{
		int no=1,space=4;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
				
			}
			for(int j=1;j<=no;j++)
			{
				System.out.print(j);
			}
			System.out.println();
			no++;
			space--;
		}
		
	}
}
