package exception_handaling;
import java.util.Scanner;

public class ThrowDemo {
    public static void main (String a[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of denominator");
        int i = sc.nextInt();
        sc.close();
        int j=0;
        try{
            j=15/i;
            if(j==0){
                throw new ArithmeticException("fianl answer cannot be zero");
            }
        }
        catch(ArithmeticException ar){
            System.out.println(ar.getMessage());
            System.out.println("something went wrong..");
        }
    }
}
