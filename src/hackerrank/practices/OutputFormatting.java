package hackerrank.practices;

import java.util.Scanner;

public class OutputFormatting {


    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String[] s = new String[3];
            int[] x = new int[3];
            
            for(int i=0;i<3;i++)
            {
                s[i]=sc.next();
                x[i]=sc.nextInt();
            }
            
            System.out.println("================================");
            
            for(int i=0;i<3;i++) {
            	System.out.printf("%1$-14s %2$03d", s[i], x[i]);
            	System.out.println();
            
            }

            
            System.out.println("================================");
            sc.close();
    }
	
}
