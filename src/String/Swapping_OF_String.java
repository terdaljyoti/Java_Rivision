package String;

public class Swapping_OF_String 
{

	public static void main(String[] args) 
	{
	
		String s1="jyoti",s2="terdal";
		System.out.println("Before Swapping :s1 = "+s1+" s2 = "+s2);
		String s3=s1+s2;
		s2=s3.substring(0,s1.length());
		s1=s3.substring(s2.length());
		System.out.println("After Swapping :s1 = "+s1+" s2 = "+s2);
	}
}
