package Fundamentals;
import java.lang.Math;

class Palindrome{
    public void PalindromeCheck(int n){
        int temp =n;
        int sum = 0;
        while(n !=0){
        sum = (10*sum) + (n%10);
        n=n/10;
        }
        if(temp==sum){
            System.out.println("it is a Palindrome number");
        }
        else{
        System.out.println("not a Palindrome number");
        }
    }
}

class Armstrong{
    public void ArmstrongCheck(int x){
        int temp=x;
        int count = 0;
        while(x>0){
            x=x/10;
            count++;
        }
        int rem =0;
        double sum =0;
        while(x!=0){
            rem=x%10;
            sum += Math.pow(rem,count);
            x=x/10;
        }
        System.out.println(sum);
        if(temp==(int)sum){
            System.out.println("it is an Armstrong number");
        }
        else{
            System.out.println("not a Armstrong nuumber");
        }
    }
}


public class PalindromeAndArmstrong {
    public static void main(String arr[]){
        Palindrome obj = new Palindrome();
        Armstrong obj2 =new Armstrong();
        obj.PalindromeCheck(121);
        obj2.ArmstrongCheck(153);
    }
}
