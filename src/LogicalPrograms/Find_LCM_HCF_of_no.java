package LogicalPrograms;

import java.util.Scanner;

public class Find_LCM_HCF_of_no
{
	public static void main(String[] args)
	{
		int x;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two No:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int NumOne=a;
		int NumTwo=b;
		
		while(b!=0)
		{
			x=b;
			b=a%b;
			a=x;
			
		}
		int hcf=a;
		int lcm=(NumOne*NumTwo)/hcf;
		
		System.out.println("HCF : "+hcf);
		System.out.println("LCM : "+lcm);
	}

}
