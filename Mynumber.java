//Number Checking
import java.util.*;


class Mynum
{
	private int dm;
		Mynum()
		{
			dm=0;
		}
	Mynum(int dm)
	{
		this.dm=dm;
		isOdd();
		isNegative();
		isPositive();
		isZero();
		isEven();
	}
	void isNegative()
	{
		if(dm<0)
		{
			System.out.println("\n The Number is Negative");
		}
		else
		{
			System.out.println("\n The Number is Not Negative ");
		}
	}
	void isPositive()
	{
		if(dm>0)
		{
			System.out.println("\n The Number is Positive ");
		}
		else
		{
			System.out.println("\n The Number is Not Positive ");
		}
	}
	void isZero()
	{
		if(dm==0)
		{
			System.out.println("\n The Number is Zero ");
		}
		else
		{
			System.out.println("\n The Number is Not Zero ");
		}
	}
	void isOdd()
	{
		if(dm%2==0)
		{
			System.out.println("\n The Number Is Not Odd");
		}
		else{System.out.println("\n The Number Is Odd");}
	}
	 void isEven()
	{
		if(dm%2==0)
		{
			System.out.println("\n The Number Is Even");
		}
		else{
			System.out.println("\n The Number Is Not Even");
		}
	}
}

class Mynumber
{
	public static void main(String args[])
	{
		int s;
		s=Integer.parseInt(args[0]);
		Mynum mn=new Mynum();
		Mynum mn1=new Mynum(s);
	}
}