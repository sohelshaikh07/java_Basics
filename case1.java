///Extraction of Numbers From String
import java.util.Scanner;
import java.util.*;
class case1
{
public static void main(String[] args)
{	
   
	int l,N,i,x,y,f=3;
	Scanner sc=new Scanner(System.in);
	System.out.println("\n Enter number of word : ");
	N=sc.nextInt();
	//N=3
String[] s=new String[N];
//s={"1","L0v3","code"};
System.out.println("\n Enter String separated by Space: ");
		for(i=0;i<N;i++)
		{
		s[i]=sc.next();
	for(char ch:s[i].toCharArray())//for each loop is used for getting all charecter one bye one manner
		{
		if(Character.isDigit(ch))//determines wether given charecter is digit or not
		{
			System.out.print(" "+ch);
			f=1;
		}
		else
		{
				if(f!=1)
				f=0;
		}
	}
}
if(f!=1)
		System.out.println("Invalid String Does Not Contain Digit please enter Valid String !");
		}
}