package StarPattern;

public class Pattern_10 
{

	public static void main(String[] args)
	{
		int star=1,space=4;
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
			star++;
			space--;
			System.out.println();
		}
		
		int space1=1,star1=4;
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=space1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star1;j++)
			{
				System.out.print("*");
			}
			space1++;
			star1--;
			System.out.println();
		}
	}
}
