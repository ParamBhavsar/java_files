package Functional_InterfaceDemo;

// to make class functional interface ie. interface which can only have single abstract method
// we use annotation @FunctionalInterface

@FunctionalInterface
interface A{
    void show();
}

public class fi1 {
    public static void main(String a[]){
    // A obj = new A()
    // {
    //     public void show(){
    //         System.out.println("hello");
    //     }
    // };           this can be reduced using lambda expression

    // as on using (lambda expr ->) we know fun. interface only have single abs method so we dont need to write that again and again 
        // A obj = ()->{
        //     System.out.println("hello");
        // }; // as single statement we dont even needs { } braces

        A obj = ()->System.out.println("hello");
        obj.show();
    }
}
