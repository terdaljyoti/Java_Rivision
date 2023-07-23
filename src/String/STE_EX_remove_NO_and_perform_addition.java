package String;

public class STE_EX_remove_NO_and_perform_addition
{
	public static void main(String[] args)
	{
		String s1="P5u7n2a8m";
		int sum=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			if(Character.isDigit(s1.charAt(i)))
			{
				sum=sum+Character.getNumericValue(s1.charAt(i));
			}
		}
		System.out.println(sum);
	}

}
