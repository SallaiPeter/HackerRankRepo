package hackerrank.interviewpreparation.warmup;

public class JumpingOnClouds {

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {

        int result = 0;

        for(int i = 0; i < c.length - 1; i++){
	         if(i + 2 == c.length)
	        	 result++;
	         else {
	        	if(c[i + 2] == 0){
	                i += 1;
	            }
	            result++;
	         }
        }

        return result;
    }
    
    public static void main(String[] args) {
    	int[] c = {0,0,0,1,0,0};
    	System.out.println(jumpingOnClouds(c));

	}

}
