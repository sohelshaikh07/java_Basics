//Hacker Rank Simple Problem

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

	public class H{
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

     /* Declare second integer, double, and String variables. */
int n;
double d1;


    
    n=scan.nextInt();
    d1=scan.nextDouble();
    scan.nextLine();
    
    String s1=scan.nextLine(); 

        /* Print the sum of both integer variables on a new line. */
        System.out.println((i+n));   
        /* Print the sum of the double variables on a new line. */
		System.out.println((d+d1));

        /* Concatenate and print the String variables on a new line; */
 
        System.out.println((s+s1));
        	/*the 's' variable above should be printed first. */
        scan.close();
    }
}