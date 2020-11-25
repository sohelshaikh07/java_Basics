//cheking the concept of blocks
class innerouter
{
  public static void main(String a[])
  {
	  int n=0;
	  outermost:
	  {
		  outer:
		  {
			  System.out.println("\nIN Outer Block");
			  inner:
			  {
				  System.out.println("\n In Inner Block\n Before The Break statement ");
				  if(n==0)
				  break outer;
				  System.out.println("\nthis is can't work");
				  
			  }
			  			  System.out.println("\n 22 IN Outer Block");
		  }
		  			  System.out.println("\nIN Outermost Block");
	  }
  }


}