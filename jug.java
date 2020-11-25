//solving water jug problem in java using Method

import java.util.*;
import java.util.Scanner;

class jug

{
static int flag=0;
  public static void main(String args[])
  {

int g,c1,c2;
    Scanner sc=new Scanner(System.in);
	
	System.out.println("\n Enter Capacity Of Two Jug : ");
	c1=sc.nextInt();
	c2=sc.nextInt();

	System.out.println("\n Enter Goal Of water Jug 1 : ");
	g=sc.nextInt();
state(0,0,c1,c2,g); 
 }

static void state(int x,int y,int c1,int c2,int g)
{
			System.out.println(" X : "+x+"  Y : "+y);

  if(flag==1)
  {
	  System.out.println("X :"+g+"  Y : "+y);
	  System.exit(0);
  }

  else{
		if(x==y && x<=c1)
			{
				flag=1;
			}
  }	
	if(y<c2)
	{
		state(x,++y,c1,c2,g);
	}
	else
	{
		if(y==c2)
		{
			if(x<=c1)
			{
				x+=1;
				y=1;
				state(x,y,c1,c2,g);
			}
			else
			{
					x=0;
					c1=1;
			}	
			
				
				}
	}
}
}