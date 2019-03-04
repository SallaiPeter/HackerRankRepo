package hackerrank.interviewpreparation.warmup;

import java.io.IOException;
import java.util.Scanner;

public class RepeatedStrings {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        if(s.length() == 1 )
            if(s.equals("a")) 
                return n;
            else 
                return 0;
        
        //count 'a'-s in the input String
        int i = 0;
        int counter = 0;
		while(i < s.length())
        	if(s.charAt(i++) == 'a') counter++;
		
		long result = counter * (n / s.length());
        
		//count 'a'-s in the remainder chars
        String lastChars = s.substring(0, (int) (n % s.length()));
        i = 0;
        counter = 0;
        while(i < lastChars.length())
        	if(s.charAt(i++) == 'a') result++;
        
     
        return result;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        System.out.println(result);
        scanner.close();
    }
}
