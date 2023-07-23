package Array;

public class SameArrayElementAtSameIndex
{
	public static void main(String[] args) 
	{
		int ar1[]= {10,20,70,50,100};
		int ar2[]= {10,20,30,70,100};
		
		for(int i=0;i<=4;i++)
		{
			if(ar1[i]==ar2[i])
			{
				System.out.println(ar1[i]+" "+ar2[i]);
			}
		}
	}

}
