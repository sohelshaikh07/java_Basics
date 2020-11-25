//
import java.util.*;

class mark
{
  public static void main(String args[])
  {
    int a,b,c,r;
	double per;
	
	Scanner sc= new Scanner(System.in);
	System.out.printf("Enter Mark Of Three Subject : ");
  
  a=sc.nextInt();
  b=sc.nextInt();
  c=sc.nextInt();
  
  if((a>=35) && (b>=35) && (c>=35))
  {
	r=a+b+c;
	per=((double)r/3);
	System.out.println("The Totale is "+r+"\tThe Percentage is : "+per);
 }
 else
  System.out.println("Fail"); 
 }
}