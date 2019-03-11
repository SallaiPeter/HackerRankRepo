package hackerrank.challenge30day;

import java.util.Scanner;

public class Day9Recursion {

    // Complete the factorial function below.
    static int factorial(int n) {

        if(n == 1)
            return n;
        else
            return n * factorial(n-1);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = factorial(n);

        System.out.println(result);
        scanner.close();
    }
}
