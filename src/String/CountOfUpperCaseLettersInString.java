package String;

public class CountOfUpperCaseLettersInString
{

	public static void main(String[] args)
	{
		String s="WelComeToHome";
		int count=0;
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			if(Character.isUpperCase(ch))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
}
