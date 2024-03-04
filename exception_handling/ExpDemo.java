package exception_handling;
import java.util.Scanner;

public class ExpDemo {
    public static void main(String a[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of denominator");
    int i = sc.nextInt();
    sc.close();
    int j =0;
    try
    {
         j = 5/i;
    }
    catch(Exception e){
        System.out.println("Something went wrong..." + e);
    }
    System.out.println("value of j is "+ j);
    System.out.println("over and out");
}
}