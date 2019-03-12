package hackerrank.interviewpreparation.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MakingAnagrams {

	private static final Scanner scan = new Scanner(System.in);

	static int makeAnagram(String s1, String s2) {

		List<Character> charsChecked = new ArrayList<Character>();

		int result = 0;

		for (int i = 0; i < s1.length(); i++) {
			char temp = s1.charAt(i);
			if (!charsChecked.contains(temp)) {
				int counter1 = 0;
				int counter2 = 0;

				for (int j = 0; j < s1.length(); j++) {
					if (s1.charAt(j) == temp)
						counter1++;
				}

				for (int j = 0; j < s2.length(); j++) {
					if (s2.charAt(j) == temp)
						counter2++;
				}

				if (counter1 > 0 || counter2 > 0) {
					charsChecked.add(temp);
					result += Math.abs(counter1 - counter2);
				}
			}
		}

		for (int i = 0; i < s2.length(); i++) {
			char temp = s2.charAt(i);
			if (!charsChecked.contains(temp)) {
				int counter1 = 0;
				int counter2 = 0;

				for (int j = 0; j < s1.length(); j++) {
					if (s1.charAt(j) == temp)
						counter1++;
				}

				for (int j = 0; j < s2.length(); j++) {
					if (s2.charAt(j) == temp)
						counter2++;
				}

				if (counter1 > 0 || counter2 > 0) {
					charsChecked.add(temp);
					result += Math.abs(counter1 - counter2);
				}
			}
		}

		return result;

	}

	public static void main(String[] args) {

		String s1 = scan.nextLine();

		String s2 = scan.nextLine();

		int result = makeAnagram(s1, s2);

		System.out.println(result);

		scan.close();

	}

}
