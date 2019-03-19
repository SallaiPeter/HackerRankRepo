package hackerrank.practices;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPrime {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();

        BigInteger bi = new BigInteger(n);
        Boolean result = bi.isProbablePrime(100);
        System.out.println(result ? "prime" : "not prime");
        scanner.close();
    }
}
