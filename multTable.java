import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class multTable{
public static int mult(int n,int i)
{
    if(i<=10)
    {
        System.out.println(n+" x "+i+" = "+(n*i));
        i++;
        mult(n,i);
    }
    return 1;
}

/*    int i=1;
        for(i=1;i<11;i++)
        System.out.println(" "+n+" x "+i+" = "+(n*i));
*/
  private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        int i=1;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n>=2 && n<=20)
        mult(n,i);
        scanner.close();
    }
}
