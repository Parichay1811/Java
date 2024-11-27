package Basic_java;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int unit = in.nextInt();
        // int unitPrice = 100;
        int total_cost = unit * 100;
        
        if(total_cost > 1000){
            int discount = total_cost * (10/100);
            int final_cost = (total_cost - discount); 
            System.out.println(final_cost);
        }
        else{
            System.out.println(total_cost);
        }
        in.close();
        
    }
    
}
