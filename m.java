//Converting Upper String to Lower String And  Count using user defined function

import java.util.*;
import java.util.Scanner;

class m
{
public static void main(String[] args)
 {
	String str;
	int c=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("\nEnter The String : ");
	str=sc.nextLine();
	int l=str.length();
	char s[]=new char[l+1];
	s=str.toCharArray();
	for(int i=0;i<str.length();i++)
	{
	if(s[i]<='Z' && s[i]>='A')
	 {//convert to lower case
		c++;
		s[i]=(char)(s[i]+'a'-'A');
	 }
	}
	System.out.println(s);
	System.out.println("\n The Count is : "+c);
 }
}