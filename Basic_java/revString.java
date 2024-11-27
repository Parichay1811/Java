package Basic_java;
import java.util.Scanner;
public class revString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a string you want to reverse: ");
        String userInput = scanner.nextLine();
        String newString = "";
        for(int i = userInput.length() - 1; i >= 0; i --){
            newString += userInput.charAt(i);
        }
        System.out.println("The reverse of the String given: " + newString);
        scanner.close();
    }
}
