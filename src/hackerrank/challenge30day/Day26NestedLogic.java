package hackerrank.challenge30day;

import java.util.Scanner;

public class Day26NestedLogic {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		int[] ret = { scan.nextInt(), scan.nextInt(), scan.nextInt() };
		int[] exp = { scan.nextInt(), scan.nextInt(), scan.nextInt() };

		int years = ret[2] - exp[2];
		int months = ret[1] - exp[1];
		int days = ret[0] - exp[0];

		int fine = years < 0 ? 0 : years > 0 ? 10000 : months > 0 ? 500 * months : days > 0 ? 15 * days : 0;

		System.out.println("days: " + days + " fine: " + fine);
	}
}
