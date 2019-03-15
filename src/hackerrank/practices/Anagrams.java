package hackerrank.practices;

import java.util.Scanner;

public class Anagrams {

        static boolean isAnagram(String a, String b) {
            
            if(a.length() != b.length())
                return false;
            
            char[] aString = a.toUpperCase().toCharArray();
            char[] bString = b.toUpperCase().toCharArray();

            //sort Arrays        
            for(int i = 0; i < aString.length - 1; i++){
                for(int j = i + 1; j < aString.length; j++){
                    if(aString[j] < aString[i]){
                        char temp = aString[i];
                        aString[i] = aString[j];
                        aString[j] = temp;
                    }
                    if(bString[j] < bString[i]){
                        char temp = bString[i];
                        bString[i] = bString[j];
                        bString[j] = temp;
                    }
                }
            }
            
            a = new String(aString);
            b = new String(bString);
            System.out.println(a + " " + b);
            return (a.compareToIgnoreCase(b) == 0) ? true : false;
            
        }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}