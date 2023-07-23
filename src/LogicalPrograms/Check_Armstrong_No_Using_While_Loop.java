package LogicalPrograms;

public class Check_Armstrong_No_Using_While_Loop 
{
	public static void main(String[] args) 
	{
		int no=153,rem,sum=0;	
		int i=no;
		while(i>0) 
		{
			rem=i%10;
			sum=sum+(rem*rem*rem);			//for 3 digit no
			i=i/10;
		}
		if(sum==no)
		{
			System.out.println(no+" is armstrong no");
		}
	}
	
}
