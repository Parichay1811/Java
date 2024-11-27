package Basic_java;
import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("hey! welcome to XYZ bank!\n");
        Scanner in = new Scanner(System.in);  
        int PIN = 1234;
        long balance = 10000000;
        int attempt = 0;
        System.out.println("Enter your PIN here: ");
        int enteredPIN = in.nextInt();
        do {
            if (attempt >= 3) {
                System.out.println("Too many incorrect attempts. Exiting.");
                return;
            }
            attempt++;
            if(enteredPIN != PIN){
                System.out.println("oooops! Please enter a valid pin!!");   
                break;       
            }
            
        }while (enteredPIN != PIN);
        

        while (enteredPIN == PIN) {
            System.out.println("Enter the ammount You want to Withdraw: " );
            int amount = in.nextInt();
            if (amount <= 100000){
                System.out.println("Your request is prossecing, please wait!");
                balance = balance - amount;
                System.out.println("Thank you for banking with XYZ bank");
                System.out.println("Your current Balance is " + balance);
            }
            break;                  
        }
         
        // System.out.println("Enter your PIN here: ");
        // enteredPIN = input.nextInt();
    }  
            
}
