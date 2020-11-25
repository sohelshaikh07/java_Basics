import java.util.*;


class dis 
{
public static void main(String args[])
{Scanner sc= new Scanner(System.in);
  int am;
  Double dis,tot=0.00;
  System.out.print("Enter Amount : ");
	am=sc.nextInt();
	dis=am*0.25;
	tot=am-dis;
  System.out.println(" Amount After Discount : "+tot);	
}
}