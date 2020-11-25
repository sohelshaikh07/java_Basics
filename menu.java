/*menu Driven program for palindrome,reverse,armstrong,factorial*/

import java.util.Scanner;

class logic
{
Scanner sc=new Scanner(System.in);
	int rev=0,r=0,num=0,rs;
  logic(int num)
  {
	  int i,fact=1;
	    this.num=num;
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
 System.out.println("The Factorial Of The Givven Number is "+fact);
 }
  logic(int rev,int r,int num)
 {
	 this.rev=rev;
	 this.r=r;
	 int t=num;
	 this.num=num;
	 while(num>0)
	 {
		r=num%10;
		rev=rev+(r*r*r);
		num=num/10;
	 }
		if(t==rev)
		{
			System.out.println("The Givven Number Is ARMSTRONG");
		}
		else
		{
			System.out.println("The Givven Number Is Not ARMSTRONG");
		}
	 }
 logic(int rev,int r,int num,int f)
 {
	 this.rev=rev;
	 this.r=r;
	 int t=num;
	 this.num=num;
	 rs=f;
	 while(num>0)
	 {
		r=num%10;
		rev=rev*10+r;
		num=num/10;
		
	 }
		if(rs==1)
		{
			if(t==rev)
			{
			 System.out.println("The Givven Number Is Palindrome "+rev);
			}
			else
			{System.out.println("The Givven Number Is Not Palindrome "+t);}
		}
		else
			 System.out.println("The Reverse Number "+rev);
 }
}


class menu
{
	
  public static void main(String a[])
  {
try{	
	Scanner sc=new Scanner(System.in);
	  int i,n;
	 
	 do{
		i=1;
	 System.out.println("\n"+i+")\tPALINDROME");
	 System.out.println(++i+")\tARMSTRONG");
	 System.out.println(++i+")\tREVESRE");
	 System.out.println(++i+")\tFACTORIAL");
     
	 
	 System.out.println("\n\n Enter Your Choice : ");
	  n=sc.nextInt();
		
		switch(n)
		{
		  case 1:System.out.println("Enter Number For Check PALINDROME or not");
					int nn=sc.nextInt();
					logic l=new logic(0,0,nn,1);
							i=1;
							break;
		  case 2:	i=2;
					System.out.println("Enter Number For Check ARMSTRONG or not ");
						int nn1=sc.nextInt();
							logic l1=new logic(0,0,nn1);
								break;
		case 3 : i=3;
					System.out.println("Enter Number For Reverse ");
					int nn2=sc.nextInt();
					logic l2=new logic(0,0,nn2,0);
					break;
 	
		case 4: i=4;
					System.out.println("Enter Number For Find Factorial ");
						int nn3=sc.nextInt();
						logic l3=new logic(nn3);
							break;
		}//end switch
	   }while(n<=i);
}//end try
catch(Exception E)
{
 System.out.println(E);
}
 }//end main
}