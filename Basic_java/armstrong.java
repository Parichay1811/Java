package Basic_java;
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(isArmstrong(num)){
            System.out.println("hollah!! its Armstrong!!");
        }
        else{
            System.out.println("Please try with another number :-( ");
        }
        // System.out.println("hollah!! its Armstrong!!");

        // while(num < 200){
        //     if(isArmstrong(num)){
        //         System.out.println(num);
        //         count +=1;
        //     }
        //     num +=1;
        // }

    }    
        public static boolean isArmstrong(int num) {
            int originalNum, remainder, result = 0, n = 0;
    
            originalNum = num;
    
            // Count number of digits
            while (originalNum != 0) {
                originalNum /= 10;
                ++n;
            }
    
            originalNum = num;
    
            // Calculate Armstrong number
            while (originalNum != 0) {
                remainder = originalNum % 10;
                result += Math.pow(remainder, n);
                originalNum /= 10;
            }
    
            // Check if num is equal to the result
            return result == num;
        }
    }
    

