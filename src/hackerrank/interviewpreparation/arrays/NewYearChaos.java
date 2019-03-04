package hackerrank.interviewpreparation.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NewYearChaos {

	static String[] result;
    // Complete the minimumBribes function below.
    static String minimumBribes(int[] goal) {
    	int length = goal.length;

    	if(length == 1 || length == 0)    		
    		return "0";
    	
    	int bribes = 0;
    	int temp;
    	
    	//return chaotic if current place + 3 bigger than value 
    	for(int i = 0; i < length; i++) {
    		if (i + 2 + 1 < goal[i])
				return "Too chaotic";
		}
    	
    	int[] actual = new int[length];
    	for(int i = 0; i < length; i++) {
    		actual[i] = i + 1;
    	}
    	
    	for(int i = 0; i < length - 2; i++) {
    		//actual is in good place?
    		if(actual[i] == goal[i]) {
    			//need to move by 1 place?
    		} else if(actual[i + 1] == goal[i]){
    				temp = actual[i];
    				actual[i] = actual[i + 1];
    				actual[i + 1] = temp;
    				bribes++;
    			//need to move by 2 place?
    		} else if (actual[i + 2] == goal[i]){
    				temp = actual[i + 2];
    				actual[i + 2] = actual[i + 1];
    				actual[i + 1] = actual[i];
    				actual[i] = temp;
    				bribes += 2;
    		}
    	}
    	
    	if(actual[length - 2] == goal[length - 1]){
			temp = actual[length - 2];
			actual[length - 2] = actual[length -1];
			actual[length -1] = temp;
			bribes++;
    	}
    	
    	return "" + bribes;
    	
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        result = new String[t];
        
        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }
            result[tItr] = minimumBribes(q);
        }

        for(String s : result)
        	System.out.println(s);
        
        scanner.close();
    }
}

/*	start
 *  1 2 3 4 5 6 7 8
 * 	1 2 3 5 4 6 7 8
 *  1 2 5 3 4 6 7 8 
 * 	1 2 5 3 4 7 6 8
 * 	1 2 5 3 7 4 6 8
 *  1 2 5 3 7 4 8 6
 *  1 2 5 3 7 8 4 6
 *  1 2 5 3 7 8 6 4 
 *  
 *  goal
 *  1 2 5 3 7 8 6 4
 *  
 */
