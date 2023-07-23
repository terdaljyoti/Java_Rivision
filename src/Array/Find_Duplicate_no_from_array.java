package Array;

public class Find_Duplicate_no_from_array 
{

	public static void main(String[] args)
	{
		int ar[]= {20,30,60,20,50,30,40};
		for(int i=0;i<=ar.length-1;i++)
		{
			for(int j=i+1;j<=ar.length-1;j++)
			{
				if(ar[j]==ar[i])
				{
					System.out.println(ar[i]);
				}
			}
		}
	}
}
