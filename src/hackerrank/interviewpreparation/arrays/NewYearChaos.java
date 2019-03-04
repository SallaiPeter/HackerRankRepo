package hackerrank.interviewpreparation.arrays;

import java.util.Scanner;

public class NewYearChaos {

	static String[] result;
    // Complete the minimumBribes function below.
    static String minimumBribes(int[] q) {
    	int length = q.length;

    	if(length == 1 || length == 0)    		
    		return "0";
    	
    	int bribes = 0;
    	int temp;
    	
    	for(int i = 0; i < length - 2; i++) {
    		if(q[i] != i + 1) {
    			if(q[i + 1] == i + 1){
    				temp = q[i];
    				q[i] = q[i + 1];
    				q[i + 1] = temp;
    				bribes++;
    			} else if (q[i + 2] == i + 1){
    				temp = q[i];
    				q[i] = q[i + 2];
    				q[i + 2] = temp;
    				bribes++;
    			} else {
    				return "Too chaotic";
    			}
    		}
    		
    	}
    	
    	if(q[length - 2] == length) {
			temp = q[length - 2];
			q[length - 2] = q[length - 1];
			q[length - 1] = temp;
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
