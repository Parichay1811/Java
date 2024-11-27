package Basic_java;
import java.util.Arrays;
import java.util.Scanner;
public class arr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    //for int datatype
     
        // int [] arr = new int[6];
        // for (int i = 0; i < arr.length; i ++){
        //     arr [i] = in.nextInt();   
        // }
        // System.out.println(Arrays.toString(arr));

    //   for String dataype
        String[] str = new String[5];
        for (int i = 0; i < str.length; i ++){
                str [i] = in.next();   
            }
            System.out.println(Arrays.toString(str));


    }
    
}
