package hackerrank.challenge30day;

import java.util.Scanner;

public class Day3IntroToConditionalStatements {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String result = "";
		if(N % 2 == 1)
			result = "Weird";
		else {
			if(N < 5 || 20 < N )
				result = "Not Weird";
			else
				result = "Weird";
		}
        
		System.out.println(result);
        scanner.close();
    }
}
