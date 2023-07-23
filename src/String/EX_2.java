package String;

public class EX_2 
{

	public static void main(String[] args)
	{
	
		String str="Hello World";
		int count=0;
		for(int i=0;i<=str.length()-1;i++)
		{
			char ch = str.charAt(i);
			 
			if(Character.isLetter(ch))
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
