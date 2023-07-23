package String;

public class Remove_Ovel_From_String 
{
	public static void main(String[] args) 
	{
		String s1="welcometojava";
		System.out.println(s1.replaceAll("[aeiou]", ""));
	}

}
