package Basic_java;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number = ");
        int a = in.nextInt();
        // int b = 1;
        // int temp = 0;
        // if (b <= a){
            // b = temp;
        long factorial = 1;
        for (int i=1; i <= a; i++){
            factorial *= i;        
            }
             
        // }
        System.out.println("the factorial of" + " " + a + " is = " + "" + factorial);

    }
}


