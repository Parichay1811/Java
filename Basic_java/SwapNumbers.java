package Basic_java;
import java.util.Scanner;
public class SwapNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the first number = ");
        int a = in.nextInt();
        System.out.println("enter the second number = ");
        int b = in.nextInt();
        int temp = a;
        // a = temp;
        a = b;
        b = temp;
        System.out.println("The swapped numbers are =");
        System.out.println("The first number is =" + a);
        System.out.println("The swapped numbers are =" + b);
    }
}

// import java.util.Scanner;

// public class SwapNumbers {

//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);

//         System.out.println("Enter the first number: ");
//         int num1 = in.nextInt();

//         System.out.println("Enter the second number: ");
//         int num2 = in.nextInt();

//         // Efficient swapping using temporary variable
//         int temp = num1;
//         num1 = num2;
//         num2 = temp;

//         System.out.println("The swapped numbers are:");
//         System.out.println("First number: " + num1);
//         System.out.println("Second number: " + num2);
//     }
// }

