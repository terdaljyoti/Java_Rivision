package String;

public class CharacterCountOfEachString 
{
	public static void main(String[] args) 
	{
		String s1="My name is Jyoti";
		String[] ch=s1.split(" ");
		
		for(int i=0;i<=ch.length-1;i++)
		{
			System.out.println("character count of String "+ch[i]+" is "+ch[i].length());
		}
		
	}

}
