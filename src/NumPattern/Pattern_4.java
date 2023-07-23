package NumPattern;

public class Pattern_4
{
/*
		54321
		5432
		543
		54
		5
*/

	public static void main(String[] args)
	{
		int no=5;
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			no--;
		}
	}
}
