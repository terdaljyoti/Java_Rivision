package Array;

public class DifferentArrayElementAtSameIndexPosition 
{
	public static void main(String[] args)
	{
		int ar1[]= {10,20,40,60,30};
		int ar2[]= {10,20,50,30,30};
		
		for(int i=0;i<=4;i++)
		{
			 if(ar1[i]!=ar2[i])
			 {
				 System.out.println(ar1[i]+" "+ar2[i]);
			 }
		}
	}

}
