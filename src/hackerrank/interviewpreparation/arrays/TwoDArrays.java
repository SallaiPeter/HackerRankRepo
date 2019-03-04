package hackerrank.interviewpreparation.arrays;

public class TwoDArrays {

	
    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
    	if(arr.length < 3 || arr[0].length < 3)
    		return 0;
    	
    	int maxArraySum = Integer.MIN_VALUE;
    	for(int i = 0; i < 4; i++) {
    		for(int j = 0; j < 4; j++) {
    			int actualSum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] 
    									  +arr[i + 1][j + 1]
    						+arr[i + 2][j] + arr[i + 2][j + 1] + arr[i + 2][j + 2];
    			if(actualSum > maxArraySum)
    				maxArraySum = actualSum;
    			System.out.println(maxArraySum + ", " + actualSum);
    		}
    	}
    	
    	return maxArraySum;
    }
    
	public static void main(String[] args) {
		int arr[][] = {
				{0, -4, -6, 0, -7, -6},
				{-1, -2, -6, -8, -3, -1},
				{-8, -4, -2, -8, -8, -6},
				{-3, -1, -2, -5, -7, -4},
				{-3, -5, -3, -6, -6, -6},
				{-3, -6, 0, -8, -6, -7}
		};

		System.out.println(hourglassSum(arr));
	}

}
