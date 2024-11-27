package Basic_java;
import java.util.Scanner;
public class circle_area {
    private static double area_of_the_circle;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();
        
        area_of_the_circle = Math.PI * Math.pow(radius,2);;
        System.out.println("the area of the circle is = " + area_of_the_circle);

    }
}
