package NumPattern;

public class Pattern_7 
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
		int no=5,space=0;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
			no--;
			space++;
		}
		
	}
}
