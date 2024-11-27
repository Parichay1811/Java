package Basic_java;
import java.util.Scanner;
public class avgMarks {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Enter the marks obtained in Bengali:");
            int Bengali = in.nextInt();
            System.out.println("Enter the marks obtained in English:");
            int English = in.nextInt();
            System.out.println("Enter the marks obtained in History:");
            int History = in.nextInt();
            

            int average = ((Bengali + English + History)/3);
            System.out.println("The average marks obtained in three subjects is:" + average);
        }
    }

}
