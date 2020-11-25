//Checking palindrome  string from given string.And also calculate the length of palindrome string.

import java.util.*;
import java.util.Scanner;


class pali
{
static void Println(String s,int low,int high)
{
	System.out.println(s.substring(low,high+1));
}


static int lps(String a)
{
		int n=a.length();
		
		int start=0,i,ml=1/*maxlength*/,k,j;
		
		boolean tab[][]=new boolean [n][n];//for making table 
//if string is palindrome then we put there true otherwise false
		
//first we make diagonal element true		
		for(i=0;i<n;i++)
		tab[i][i]=true;
		
//for maxlength=2 		
		for(i=0;i<n-1;i++)
		{
			if(a.charAt(i)==a.charAt(i+1))
			{
				tab[i][i+1]=true;
				start=i;
				ml=2;	
			}
		}
		
		for(k=3;k<=n;k++)
		{
			for(i=0;i<n-k+1;i++)
			{
				j=i+k-1;
				if(tab[i+1][j-1] && a.charAt(i)==a.charAt(j))
				{
				 tab[i][j]=true;
				if(k>ml)
				{
					ml=k;
					start=i;
				}
				}
			}	
		}
System.out.println("\n Longest palindrome String is  : ");
//Println(a,start,start+ml-1);
	System.out.println(a.substring(start,start+ml));
return ml;
}

  public static void main(String [] args)
  {
	  int j=0;
     Scanner sc=new Scanner(System.in);
	 String a;
	 System.out.println("\n Enter String : ");
	 a=sc.next();
	int l=lps(a);
	System.out.println("\n Length : "+l);
  }//end main
}//end class