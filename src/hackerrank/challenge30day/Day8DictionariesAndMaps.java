package hackerrank.challenge30day;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day8DictionariesAndMaps {
   
	public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        
        int entries = in.nextInt();
        for(int i = 0; i < entries; i++){
            String name = in.next();
            int phoneNumber = in.nextInt();
            phoneBook.put(name, phoneNumber);
            
        }
        
        while(in.hasNext()){
            String name = in.next();
            if(phoneBook.containsKey(name))
            	System.out.println(name + "=" + phoneBook.get(name));
            else
            	System.out.println("Not found");
        }
        
        in.close();
    }
}
