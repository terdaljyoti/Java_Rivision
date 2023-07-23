package NumPattern;

public class Pattern_2 
{

/*

	1
	22
	333
	4444
*/

		public static void main(String[] args)
		{
			int no=1;
			for(int i=1;i<=4;i++)
			{
				for(int j=1;j<=no;j++)
				{
					System.out.print(i);
				}
				no++;

				System.out.println();
			}
		}

}
