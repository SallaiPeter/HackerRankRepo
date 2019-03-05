package hackerrank.interviewpreparation.dictionariesandhashmaps;

import java.util.*;

public class HashTableRansomNote {

    // Complete the checkMagazine function below.
    static void checkMagazine(String[] magazine, String[] note) {

    	ArrayList<String> myList = new ArrayList<>(Arrays.asList(magazine));
    	for(int i = 0; i < note.length; i++) { 
    		if(!myList.contains(note[i])) {
    			System.out.println("No");
    			return;
    		} else {
    			myList.remove(myList.indexOf(note[i]));
    		}
    	}
    	System.out.println("Yes");
    			
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}
