package javacodes_hackerrank;

import java.util.*;
public class OutputFormat {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        
        for(int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            
            // Format: %-15s means left-aligned string in 15 chars width
            //         %03d means 3-digit integer with leading zeros
            System.out.printf("%-15s%03d%n", s1, x);
        }
        
        System.out.println("================================");
        sc.close();
  }
}
