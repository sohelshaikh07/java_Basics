import java.io.*;
import java.lang.Math;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class maxper {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent)
     {
            double tip;
            double tax;
            double totalCost;
            tip=(meal_cost*tip_percent)/100;
            tax=(meal_cost*tax_percent)/100;
            totalCost=meal_cost+tip+tax;
            System.out.println(Math.round(totalCost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            System.out.println("meal_cost : "+meal_cost+"  tip_percent : "+tip_percent+"  tax_percent "+tax_percent);

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
