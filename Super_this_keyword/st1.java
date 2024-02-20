package Super_this_keyword;
class A{
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int x){
        super();
        System.out.println("in int A");
    }
}
class B extends A{
    public B(){
        super(); // when prog. reaches here it makes execute default constructor of super class ie. A
        System.out.println("in B");
    }
    public B(int x){
        super(); // when prog. reaches here it makes execute default constructor of super class ie. A
        System.out.println("in int B");
    }
}

public class st1 {
    public static void main(String a[]){
        B obj = new B();
        //in A
        //in B

        B obj2 = new B(5);
        // in A       first reach line 13=>14=>3=>15=>17=>18=>3=>19
        // in B
        // in A
        // in int B
    }
}
