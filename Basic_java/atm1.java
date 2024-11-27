package Basic_java;
import java.util.Scanner;

public class atm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey! Welcome to XYZ Bank!");

        final int PIN = 1234; // Use 'final' for constants
        long balance = 10000000; // Balance initialized to 10 million

        int attempt = 0;
        int enteredPIN;
        do {
            if (attempt >= 3) {
                System.out.println("Too many incorrect attempts. Exiting.");
                return;
            }
            System.out.print("Enter your PIN here: ");
            enteredPIN = scanner.nextInt();
            if (enteredPIN != PIN) {
                System.out.println("Oops! Incorrect PIN. Try again.");
            }
            attempt++;
        } while (enteredPIN != PIN);

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Withdraw");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter the amount you want to withdraw: ");
                int amount = scanner.nextInt();

                if (amount > balance) {
                    System.out.println("Insufficient funds! Try a smaller amount.");
                } else {
                    balance -= amount;
                    System.out.println("Your request is being processed. Please wait...");
                    System.out.println("Withdrawal successful!");
                    System.out.println("Your current balance is: " + balance);
                }
            } else if (choice == 2) {
                System.out.println("Thank you for banking with XYZ Bank!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

    

