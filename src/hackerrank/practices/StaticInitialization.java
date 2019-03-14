package hackerrank.practices;

import java.util.Scanner;

public class StaticInitialization {

	static Scanner scan = new Scanner(System.in);

	static int B = scan.nextInt();
	static int H = scan.nextInt();
	static boolean flag = B > 0 && H > 0;

	static {
		if (!flag)
			System.out.println("java.lang.Exception: Breadth and height must be positive");
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.print(area);
		}

	}

}