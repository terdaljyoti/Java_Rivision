package LogicalPrograms;

public class Palindrom_NO 
{

	public static void main(String[] args)
	{
		
		int no=12321,rev=0,rem=0;
		int i=no;
		while(i>0)
		{
			rem=i%10;
			rev=(rev*10)+rem;
			i=i/10;
		}
		if(no==rev)
		{
			System.out.println(no+" is palindrom");
		}
		else
		{
			System.out.println(no+" is not palindrom");
		}
	}
}
