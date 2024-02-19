package Functional_InterfaceDemo;

interface A{
    int add(int m , int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        // A obj= (m,n)->{
        //     return m+n;
        // };
        // or
        A obj = (m,n) -> m+n; //for return we dont need to specify for single line statement
        int result=obj.add(5, 6);
        System.out.println(result);
    }
}
