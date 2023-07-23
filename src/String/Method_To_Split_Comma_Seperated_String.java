package String;

public class Method_To_Split_Comma_Seperated_String 
{

	public void m1(String inputString)
	{
		 String ch[]=inputString.split(",");
		 for(int i=0;i<=ch.length-1;i++)
		 {
			 System.out.print(ch[i]+" ");
		 }
	} 
	public static void main(String[] args) 
	{
		Method_To_Split_Comma_Seperated_String obj1=new Method_To_Split_Comma_Seperated_String();
		obj1.m1("djhj,skjhf,jsdkj,sjkh");
	}
}
 