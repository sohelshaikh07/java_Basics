/*The Armstrong Number from 1 to you Enter */


import java.util.Scanner;

class armstrong
{
  public static void main(String a[])
  {
	Scanner sc=new Scanner(System.in);
	int sum,n,temp1,t2,j,i,ii;
	System.out.println("\n Enter Number You Want To find Armstrong From 1 to : ");
	n=sc.nextInt();
	System.out.println("The Armstrong Number : ");
	for(ii=1;ii<=n;ii++)
	{
		sum=0; //imp
		temp1=ii;
		t2=ii;
		while(temp1>0)
		{
			j=temp1%10;
			sum=sum+(j*j*j);
			temp1=temp1/10;
		}
		if(sum==t2)
		{
			System.out.println(""+sum);
		}		
	}
  }
}