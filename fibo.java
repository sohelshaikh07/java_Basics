/*Fibbonaci Number */
import java.util.Scanner;

class fibo
{
	public static void main(String a[])
	{
	Scanner sc=new Scanner(System.in);
	int n,i=0,j=1,k=0;
	System.out.println("Enter Number : ");
	n=sc.nextInt();
	System.out.println("Fibbonaci Number : ");
	System.out.print(i+"\t"+j);
	for(int q=2;q<=n;q++)
	{
	  k=i+j;
		System.out.print("\t"+k);
		i=j;
		j=k;
	}
 }
}