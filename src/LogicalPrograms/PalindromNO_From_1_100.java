package LogicalPrograms;

import java.util.ArrayList;

public class PalindromNO_From_1_100
{

	public static void main(String[] args) 
	{
		 int rem,rev=0,no=1;
		 for(int i=1;i<=200;i++)	//Palindrom No from 1 to 200
		 {
			 no=i;
			 while(no>0)
			 {
				 rem=no%10;
				 no=no/10;
				 rev=(rev*10)+rem;
			 }
			 if(i==rev)
			 {
				 System.out.println(i);
			 }
			 rev=0;
		 }
	}
}