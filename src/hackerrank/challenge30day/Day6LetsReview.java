package hackerrank.challenge30day;

import java.util.Scanner;

public class Day6LetsReview {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int caseNumber = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		
		String[] odd = new String[caseNumber];
		String[] even = new String[caseNumber];
		
		for(int i = 0; i < caseNumber; i++) {
			String input = scanner.nextLine();
			even[i] = "";
			odd[i] = "";
			
			for(int j = 0; j < input.length(); j++) {
				if(j % 2 == 0)
					even[i] += input.charAt(j);
				else
					odd[i] += input.charAt(j);
				
			}
		}
		
		for(int i = 0; i < caseNumber; i ++)
			System.out.println(even[i] + " " + odd[i]);
		
		
		scanner.close();

	}

}
