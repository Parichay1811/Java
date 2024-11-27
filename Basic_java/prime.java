package Basic_java;
public class prime {
   public static void main(String[] args) {
    int a = 2;
    int num = 17;
    while (num > a){
        if((num % a)== 0){
            System.out.println("notPrime");
            a += 1;
        }
        break;        
    }
    System.out.println("Prime");
     
   }
}
