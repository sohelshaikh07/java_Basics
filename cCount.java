//Given Charecter Count from the given string

import java.util.*;
import java.util.Scanner;
class cCount
{
	public static void main(String[] args)
	{
	  String str;
	   Scanner sc=new Scanner(System.in);
	    System.out.println("Enter The String : ");
	     str=sc.nextLine();
			int l=str.length();
			 char s[]=new char[l+1];
			 s=str.toCharArray();
			  int co=0;
		 System.out.println("\n Enter The char : ");
		 char r=sc.next().charAt(0);
		 for(int i=0;i<l;i++)
		 {
			if(r==s[i])
				co++;
		 }
		System.out.println("the Char : "+r+" Number Of Count : "+co);
	}
}