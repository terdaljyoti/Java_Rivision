package String;
public class EX_4
{
	public static void main(String[] args) 
	{
	
		String s1="india is my country";
		String ar[]=s1.split(" ");
		String largest="";
		for(int i=0;i<=ar.length-1;i++)
		{
			if(ar[i].length()>largest.length())
			{
				largest=ar[i];
			}
		}
		System.out.println(largest);
	}
	
}
