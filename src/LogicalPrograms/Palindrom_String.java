package LogicalPrograms;

public class Palindrom_String 
{

	public static void main(String[] args)
	{
		String original="madam",reverse="";
		for(int i=original.length()-1;i>=0;i--)
		{
			reverse=reverse+original.charAt(i);
		}
		if(original.equals(reverse))
		{
			System.out.println("string is palindrom ");
		}
		else
		{
			System.out.println("string is palindrom ");
		}
	}
}
