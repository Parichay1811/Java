package Basic_java;
import java.util.Scanner;
public class sumofN {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Enter the numbers to be added:");
       int N = in.nextInt();
       long Sum = 0;
        for (int i=1; i <= N; i++){
            Sum += i;
        }
        System.out.println("The sum of" + N + "numbers is" + Sum);
    }
}