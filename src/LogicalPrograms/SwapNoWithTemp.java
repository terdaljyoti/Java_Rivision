package LogicalPrograms;

public class SwapNoWithTemp 
{

	public static void main(String[] args) 
	{
	
		int a=10,b=20,temp=0;
		System.out.println("Before Swapping :a ="+a+" b = "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping :a ="+a+" b = "+b);
	}
}
