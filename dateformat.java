import java.util.*;
//import java.util.Date.*;
import java.text.SimpleDateFormat;
class dateformat
{
	public static void main(String args[])
	{
		Date dd=new Date();
		SimpleDateFormat sf;
		String d;
		
			sf =new SimpleDateFormat("dd/MM/YYYY");
			d=sf.format(dd);
		System.out.println("\n1) Current Date is "+d);
			sf =new SimpleDateFormat("dd-MM-YYYY");
			d=sf.format(dd);
		System.out.println("\n2) Current Date is "+d);
			sf =new SimpleDateFormat("EEEE MMMM dd YYYY");
			d=sf.format(dd);
		System.out.println("\n3) Current Date is - "+d);
		sf=new SimpleDateFormat("EE MMMM dd HH:mm:ss z y");
		d=sf.format(dd);
		System.out.println("\n4) Current Date is - "+d);
		sf=new SimpleDateFormat("dd/MM/YY HH:mm:ss a Z ");
		d=sf.format(dd);
		System.out.println("\n5) Current Date is - "+d);

	sf=new SimpleDateFormat("HH:mm:ss");
	d=sf.format(dd);
	System.out.println("\n6) Current Time is - "+d);
	
	sf=new SimpleDateFormat("w");
	d=sf.format(dd);
	System.out.println("\n7) Current week of year - "+d);
	
	sf=new SimpleDateFormat("MM");
	d=sf.format(dd);
	System.out.println("\n8) Current Month of year - "+d);
	
	sf=new SimpleDateFormat("D");
	d=sf.format(dd);
	System.out.println("\n9) Current Day of year - "+d);
	
	}//end main
}//end class 