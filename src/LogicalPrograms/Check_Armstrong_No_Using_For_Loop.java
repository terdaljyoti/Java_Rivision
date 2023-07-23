package LogicalPrograms;

public class Check_Armstrong_No_Using_For_Loop 
{

	
	public static void main(String[] args) 
	{
		int num=1634,rem,sum=0;
		
		for(int i=num;i>0;i=i/10)
		{
			rem=i%10;
			sum=sum+(rem*rem*rem*rem);		//for 4 digit no
		}
		if(sum==num)
		{
			System.out.println(num+" is armstrong number");
		}
	}
}
