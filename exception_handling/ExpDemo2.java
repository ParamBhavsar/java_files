package exception_handling;
import java.util.Scanner;

public class ExpDemo2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter value of denominator");
        int i = sc.nextInt();
        sc.close();
        int j = 0;
        int[] arr = new int[5];

        try{
            j=5/i;
            System.out.println(arr[0]);
            System.out.println(arr[5]);
        }
        catch(ArithmeticException a){
            System.out.println("cannot divide it by zero");
        }// if deno. 0 then this catch block will exceute

        catch(IndexOutOfBoundsException ind){
            System.out.println("index out of bound" + ind);
        }// if indx out of bound then this catch block will exceute
        
        catch(NullPointerException np){
            System.out.println("null pointer exception");
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }// Exception is parent class so first will go for aretm. excep then indxoutofbound excep than for a good practice if other error we can caught it generally as Exception e 

        System.out.println("value of j is "+j);
        System.out.println("over and out");
    }
}
