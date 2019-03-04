package hackerrank.interviewpreparation.warmup;

public class CountingValleys {

	public static void main(String[] args) {
		
		String s = "UUDDDDUU";
		int n = 8;
		
		System.out.println(countingValleys(n, s));
		
	}

    static int countingValleys(int n, String s) {
    	int pos= 0;
    	int valleys = 0;
		
    	for(int i = 0; i < n; i++) {
    		char actual = s.charAt(i);
    		
    		if(pos == 0 && actual == 'D' )
    			valleys++;
    		
    		if( actual == 'U') 
    			pos += 1;
    		else if(actual == 'D')
    			pos -= 1;
    		else
    			System.out.println("Wrong move.");
    	}
    	
    	return valleys;
    }
}
