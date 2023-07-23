package String;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Demo 
{
	 public static void main(String args[])
     { 
        String s1="welcome";
        
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<=s1.length()-1;i++)
        {
            char ch=s1.charAt(i);
            if(mp.containsKey(ch))
            {
                mp.put(ch,mp.get(ch)+1);
            }
            else
            {
                mp.put(ch,1);
            }
        }
           Set<Character> allKeys = mp.keySet();
        for(Character key:allKeys)
        {
            System.out.println(key+"="+mp.get(key));
        }
   }
  }