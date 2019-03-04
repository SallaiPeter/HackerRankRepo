package hackerrank.interviewpreparation.arrays;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MinimumSwaps2 {

	   // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
		
    	if(arr.length == 1 || arr.length == 0) return 0;
    	
    	int swaps = 0;
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] != i + 1) {
				int value = i + 1;
				int j = i;
				while(arr[j] != value )
					j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				swaps++;
			}
		}
    	return swaps;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = 
        		new BufferedWriter(
        				new FileWriter("../tempForHackerRank.txt"));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = minimumSwaps(arr);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
