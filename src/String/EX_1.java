package String;
public class EX_1 
 {
  /*
	public static void main(String[] args) 
   {
	   String str="hello";
	   ArrayList<String>ar=new ArrayList<>();
	   for(int i=0;i<=str.length()-1;i++)
	   {
		   char ch = str.charAt(i);
		   String s1=String.valueOf(ch);
		   if(i%2==0)
		   {
			  
			  String value = m1(s1);
			  ar.add(value);
		   }
		   else
		   {
			    ar.add(s1);
		   }
		   
	  }
	   for(String s:ar)
	   {
		    System.out.print(s);
	   }
	   
   }
   public static String m1(String s1)
   {
	String ch = s1.toUpperCase();
	
	return ch;   
   }
   */
	
	public static void main(String[] args) 
	{
	
		String s1="hello";
		for(int i=0;i<=s1.length()-1;i++)
		{
			String s="";
			if(i%2==0)
			{
				s=s+s1.charAt(i);
				System.out.print(s.toUpperCase());
			}
			else
			{
			s=s+s1.charAt(i);
			System.out.print(s);
			}
		}
	}
}