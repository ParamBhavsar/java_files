class A
{
    public void A_show(){
        System.out.println("in A show");
    }
    class B
    {
        public void show(){
            System.out.println("in B show");
        }
    }
}

public class demo {
    public static void main(String args[]){
    A obj = new A();
    obj.A_show();

    A.B obj1= obj.new B();   
    obj1.show();
    }
}
