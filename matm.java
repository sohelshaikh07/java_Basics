	//multiplication of two matrix 
	import java.util.*;
	
	class matm 
	{ 
	  public static void main(String args[])
	  {
try{
			    Scanner sc=new Scanner(System.in);
		int a[][],b[][],c[][],i,k,j,r1,r2,c1,c2;
		
System.out.println("\nWe are going to calculate multiplicstion of two matrix  ("+"Enter  same Coloum and same row of two matrix"+")");
		System.out.println("\n Enter The Row And Colom Of First Matrix");
		r1=sc.nextInt();
		c1=sc.nextInt();
		a=new int[r1][c1];
		c=new int[r1][c1];
		System.out.println("\n Enter Element");
	  for(i=0;i<r1;i++)
	  {
		for(j=0;j<c1;j++)
		{
		 a[i][j]=sc.nextInt();
		}
	  }

		System.out.println("\n Enter The Row And Colom Of second Matrix");
		r2=sc.nextInt();
		c2=sc.nextInt();
		b=new int[r1][c1];
		
		System.out.println("\n Enter Element");
	  for(i=0;i<r2;i++)
	  {
		for(j=0;j<c2;j++)
		{
		 b[i][j]=sc.nextInt();
		}
	  }
	  for(i=0;i<r1;i++)
	  {
		for(j=0;j<c1;j++)
		{
		for(k=0;k<r1;k++)
	 	 {	
			c[i][j]=c[i][j]+(a[i][k]*b[k][j]);	
		 }
		}
	 }		
			System.out.println("\n The Multiplication is : ");
	  for(i=0;i<r1;i++)
	  {
		  System.out.println("");
		for(j=0;j<c1;j++)
		{
				System.out.print("\t"+c[i][j]);
		}
	  }
 }
catch(Exception E)
{
	System.out.println("\n Exception Occur :- "+E);
}	
 }
}