package hackerrank.challenge30day;

import java.util.Scanner;

public class Day4ClassVsInstance {

    private int age;	
    
	public Day4ClassVsInstance(int initialAge) {
		if(initialAge < 0)
			System.out.println("Age is not valid, setting age to 0. ");
		else
			age = initialAge;
	}


	public void amIOld() {
  		System.out.println(
  				age < 13 ? "You are young.":
				age >= 18 ? "You are old." :
				"You are a teenager.");
	}

	public void yearPasses() {
  		age++;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Day4ClassVsInstance p = new Day4ClassVsInstance(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }

}
