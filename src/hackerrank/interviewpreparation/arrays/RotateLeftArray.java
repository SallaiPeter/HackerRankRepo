package hackerrank.interviewpreparation.arrays;

import java.util.Arrays;

public class RotateLeftArray {

	 // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

    	if(a.length == 0 || d == 0)
    		return a;
    	
    	for(int i = 0; i < d; i++){
			int temp = a[0];
			for(int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length - 1] = temp;;
		
		}
    	
    	return a;
    }
    
	public static void main(String[] args) {
		
		int d = 4;
		int a[] = {1, 2, 3, 4, 5};
		System.out.println(Arrays.toString(rotLeft( a, d)));
		
	}

}
