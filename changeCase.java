//changing the case of the given Number of string string 

import java.util.*;
import java.util.Scanner;

class changeCase
{
 public static void main(String args[])
 {
   
   int n,i;
   Scanner sc=new Scanner(System.in);
   System.out.println("\nhow many words you want\n Enter Number : ");
   n=sc.nextInt();//number for how many words you want
   String s[]=new String[n];
   System.out.println("\n Enter String : ");
   try
   {
	   for(i=0;i<n;i++)
		{
		   s[i]=sc.next();
		}
	   for(i=0;i<n;i++)
	   {
		   System.out.println(" "+s[i].toUpperCase());
	   }
    }
	catch(Exception e)
	{
		System.out.println("Excepttion Found :-  "+e);
	}
}
}