package String;

public class RemoveAllSpecialSymbolsFromString 
{

	public static void main(String[] args) 
	{
	
		String s1="n*d&j$h3#45!fgjn@84$";
		System.out.println(s1.replaceAll("[^0-9,a-z,A-Z]",""));
	}
}
