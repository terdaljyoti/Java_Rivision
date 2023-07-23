package Array;

import java.util.HashMap;
import java.util.Set;

public class CountOfDuplicateNumFromArray 
{

	public static void main(String[] args) 
	{
	
		int ar[]= {3,6,5,4,3,2,3,4,5,6,7,4,6,1,2,3,4,5,6,7,7,8,9,9,8,7,6,2,9,5,7,8,5,4,4,7,3,2,6,5,5,4,3,2,2,3,6,5,3,4,3,6,5,4,3,2,3,4,5,6,7,4,6,1,2,3,4,5,6,7,7,8,9,9,8,7,6,2,9,5,7,8,5,4,4,7,3,2,6,5,5,4,3,2,2,3,6,5,3,4};
		HashMap< Integer, Integer> mp=new HashMap<>();
		for(int i=0;i<=ar.length-1;i++)
		{
			int no = ar[i];
			if(mp.containsKey(no))
			{
				mp.put(no,mp.get(no)+1);
			}
			else
			{
				mp.put(no, 1);
				
			}
		}
		Set<Integer> allKeys = mp.keySet();
		for(int key:allKeys)
		{
			if(mp.get(key)>1)
			{
				System.out.println(key+"-"+mp.get(key));
			}
		}
	}
}
