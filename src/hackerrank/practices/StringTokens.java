package hackerrank.practices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        
        for(int i = 0; i < s.length(); i++) {
        	if(s.charAt(i) == ' ' ||
        			s.charAt(i) == '?' ||
        			s.charAt(i) == '!' ||
        			s.charAt(i) == ',' ||
        			s.charAt(i) == '.' ||
        			s.charAt(i) == '_' ||
        			s.charAt(i) == '@' ||
        			s.charAt(i) == '\''
        			) {
        		s = s.replace(s.charAt(i), '!');
        	}
        }
        String[] result = s.split("!");
        int counter = 0;
        for(int i = 0; i < result.length; i++){
        	if(!result[i].isEmpty())
        		counter++;
        }
        System.out.println(counter);
        
        for(int i = 0; i < result.length; i++){
        	if(!result[i].isEmpty())
        		System.out.println(result[i]);
        }
        
        
        
        scan.close();
    }
}

