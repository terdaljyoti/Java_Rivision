package String;

public class ReverseEachWordOfString 
{
	
	public static void main(String[] args) 
	{
	
		String s1="my name is abc";
		String rev;
		String ch[]=s1.split(" ");							//ch[0]:my  ch[1]:name  ch[2]:is  ch[3]:abc  
		for(int i=0;i<=ch.length-1;i++)
		{
			 rev="";
			 for(int j=ch[i].length()-1;j>=0;j--)
			 {
				 rev=rev+ch[i].charAt(j);
			 }
			 System.out.print(rev+" ");
		}
		
	}
	
/*	public static void main(String[] args) 
	{
		String inputString="java is object oriented programming language";
		String[] words = inputString.split(" ");
		
		String reverseString="";
		for(int i=0;i<=words.length-1;i++)
		{
			String word=words[i];
			String reverseWord="";
			for(int j=word.length()-1;j>=0;j--)
			{
				reverseWord=reverseWord+word.charAt(j);
			}
			reverseString=reverseString+reverseWord+" ";	
		}
		
		System.out.println("input String :"+inputString);
		System.out.println("reversed String :"+reverseString);
	}
	*/
}
