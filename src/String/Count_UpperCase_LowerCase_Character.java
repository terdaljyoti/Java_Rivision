
package String;
public class Count_UpperCase_LowerCase_Character
{
	public static void main(String[] args)
	{
		int lowerCase=0;
		int UpperCase=0;
		
		/*for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch=='E')
			{
				UpperCase++;
				
			}
			if(ch=='e')
			{
				lowerCase++;
			}
			
		}
		
		System.out.println("occurence of lowercase :"+lowerCase);
		System.out.println("occurence of UpperCase :"+UpperCase);
		*/
		System.out.println("========================================================================");
		
		String s1="E7se5e6nc4e";
		int lower=0;
		int upper=0;
		int digit=0;
		String U=" ";
		String L=" ";
		String D=" ";
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(ch<='Z'&&ch>='A')
			{
				upper++;
				U=U+ch+",";
			}
			else if(ch<='z'&&ch>'a')
			{
				lower++;
				L=L+ch+",";
			}
			else if(Character.isDigit(ch))
			{
				digit++;	
				D=D+Character.getNumericValue(ch)+",";
			}
			
		}
		System.out.println("uppercase letter count :"+upper);
		System.out.println("lowercase letter count :"+lower);
		System.out.println("Digits :"+digit);
		
		System.out.println("========================================================================");
		
		System.out.println("Uppercase Letters :"+U);
		System.out.println("Lower Case Letters :"+L);
		System.out.println("Digits :"+D);
		
	}

}
