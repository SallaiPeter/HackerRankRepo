package hackerrank.challenge30day;

import java.util.Scanner;

public class Day10BinaryNumbers {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		String binary = Integer.toString(n, 2);
		int longest = 0;

		for (int i = 0; i < binary.length(); i++) {
			int tempCounter = 0;
			while (i < binary.length() && binary.charAt(i) == '1') {
				tempCounter++;
				i++;
			}
			if (tempCounter > longest) {
				longest = tempCounter;
			}

		}

		System.out.println(longest);

		scanner.close();
	}
}
