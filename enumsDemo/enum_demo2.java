package enumsDemo;
// An enum can, just like a class , have attributes and methods. 
// The only difference is that enum constants are public , static and final (unchangeable - cannot be overridden). 
// An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

enum status{
    running , failed , pending , success;
}

public class enum_demo2 {
    public static void main(String a[]){
        
        status s =status.running;
        switch (s) {
            case running:
                System.out.println("its running");
                break;
            
            case pending:
                System.out.println("process is still pending");
                break;

            case success:
                System.out.println("success");
                break;

            default:
                System.out.println("process failed");
                break;
        }
    }
}
