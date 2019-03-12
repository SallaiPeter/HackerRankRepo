package hackerrank.interviewpreparation.dictionariesandhashmaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SherlockAndAnagrams {

	private static final Scanner scanner = new Scanner(System.in);

	static int sherlockAndAnagrams(String s) {

		Map<char[], Integer> pairs = new HashMap<char[], Integer>();

		for (int firstCharOfFirstString = 0; firstCharOfFirstString < s.length() - 1; firstCharOfFirstString++) {
			int lengthOfStrings = 1;

			while (s.length() - lengthOfStrings > firstCharOfFirstString) {
				int firstCharOfSecondString = firstCharOfFirstString + 1;
			
				while (firstCharOfSecondString <= s.length() - lengthOfStrings) {
					char[] chars1 = new char[lengthOfStrings];
					char[] chars2 = new char[lengthOfStrings];
					for (int actualChar = 0; actualChar < lengthOfStrings; actualChar++) {
						chars1[actualChar] = s.charAt(firstCharOfFirstString + actualChar);
						chars2[actualChar] = s.charAt(firstCharOfSecondString + actualChar);
					}

					Arrays.sort(chars1);
					Arrays.sort(chars2);
					if (Arrays.equals(chars1, chars2)) {
//						System.out.print("Equals! \t");
//						System.out.print(chars1);
//						System.out.print("\t");
//						System.out.println(chars2);
						if (pairs.containsKey(chars1))
							pairs.put(chars1, pairs.get(chars1) + 1);
						else
							pairs.put(chars1, 1);

					}

					firstCharOfSecondString++;
				}
				lengthOfStrings++;
			}
		}

		int result = 0;
		for (Map.Entry<char[], Integer> entry : pairs.entrySet())
			result += entry.getValue();

		return result;

	}

	public static void main(String args[]) {

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {

			String word = scanner.next();
			scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

			System.out.println(sherlockAndAnagrams(word));

		}

		scanner.close();
	}
}
