package Array;

public class Find_Prime_No_From_Array
{

	public static void main(String[] args)
	{
		int count;
		int ar[]= {13,23,29,19,42,53,57};
		for(int i=0;i<=ar.length-1;i++)
		{
			count=0;
			for(int j=1;j<=ar[i];j++)
			{
				if(ar[i]%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(ar[i]);
			}
		}
		
	}
}
