package hackerrank.interviewpreparation.warmup;

import java.util.ArrayList;

public class SockMerchant {

	static int sockMerchant(int n, int[] ar) {
        int sumOfPairs = 0;
        ArrayList<Integer> listOfColorsInArray = new ArrayList<Integer>();
       
        for(int i = 0; i < n - 1; i++){
            System.out.println("i értéke: " + ar[i] + ", " + !listOfColorsInArray.contains(ar[i]));
        	if(!listOfColorsInArray.contains(ar[i])){
        		int j = i + 1;
                int counter = 1 ;
                while(j < n){
                	if(ar[i] == ar[j])
                        counter++;
            		j++;;
                }
                listOfColorsInArray.add(ar[i]);
                sumOfPairs += counter / 2;
                System.out.print("counter: " + counter);
        		
            }
        }
        return sumOfPairs;

    }
	
	
	public static void main(String[] args) {
		int n = 9;
		int[] ar = new int[n];
		ar[0] = 10;
		ar[1] = 20;
		ar[2] = 20;
		ar[3] = 10;
		ar[4] = 10;
		ar[5] = 30;
		ar[6] = 50;
		ar[7] = 10;
		ar[8] = 20;
		
		System.out.println(sockMerchant(n, ar));
	}
}