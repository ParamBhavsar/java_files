package Super_this_keyword;

class a{
    public a(){
        super();
        System.out.println("in A");
    }
    public a(int x){
        super();
        System.out.println("in int A");
    }
}
class b extends a{
    public b(){
        super(4); // when prog. reaches here it makes execute "parameterized" constructor of super class ie. A
        System.out.println("in B");
    }
    public b(int x){
        super(); 
        System.out.println("in int B");
    }
}

public class st2 {
    public static void main(String[] args) {
        b obj = new b();
        // in int a
        // in b

        b obj2 = new b(5);
        // in A
        // in int B
    }
}
