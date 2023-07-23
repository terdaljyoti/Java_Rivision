package Array;

import java.util.Arrays;

public class Array_Sorting 
{

	public static void main(String[] args)
	{
	
		int ar[]= {50,20,80,60,10,40};
		
		System.out.println("----Before sorting Array Elements :----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		Arrays.sort(ar);
		System.out.println();
		System.out.println("----After sorting Array Elements :----");
		for(int i=0;i<=ar.length-1;i++)
		{
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		System.out.println("----Array Elements in Reverse Order----");
		for(int i=ar.length-1;i>=0;i--)
		{
			System.out.print(ar[i]+" ");
		}
	}
}
