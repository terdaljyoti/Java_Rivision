package Array;

import javax.sound.midi.Synthesizer;

public class Swap_Two_Array 
{

	public static void main(String[] args) 
	{
	
		int ar1[]= {10,30,50,70,90};
		int ar2[]= {20,40,60,80,100};
		int temp[]=new int[5];
		
		System.out.println("----------Before Swapping :----------");
		System.out.println("--1 st array elements :--");
		for(int i=0;i<=ar1.length-1;i++)
		{
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		System.out.println("--2 nd array elements :--");
		for(int i=0;i<=ar2.length-1;i++)
		{
			System.out.print(ar2[i]+" ");
		}
		
		
		for(int i=0;i<=4;i++)
		{
			temp[i]=ar1[i];
			ar1[i]=ar2[i];
			ar2[i]=temp[i];
			
		}
		System.out.println();
		System.out.println("----------After Swapping :-----------");
		System.out.println("--1 st array elements :--");
		for(int i=0;i<=ar1.length-1;i++)
		{
			System.out.print(ar1[i]+" ");
		}
		System.out.println();
		System.out.println("--2 nd array elements :--");
		for(int i=0;i<=ar2.length-1;i++)
		{
			System.out.print(ar2[i]+" ");
		}
	}
}
