package exception_handling;

class InvalidateAgeExcep extends Exception{   // for custom excep. we need to extends exception class(base class)
    InvalidateAgeExcep(String s){             // define a constructor with string that displays the error msg 
        super(s);                            // using super pass the msg to Exception class constructor
    }
}
class AgeValidator{
    public void ValidateAge(int x) throws InvalidateAgeExcep{  // throws indicate this method might throws an err so be ready with it to handle within main class so we use try catch block in main
        if(x<18){
            throw new InvalidateAgeExcep("not a valid age for work");  // this error msg get throwed and get caught using catch block
        }
        System.out.println("valid age");
    }
}

public class CustomExcepDemo {
    public static void main(String[] args) {
        AgeValidator obj = new AgeValidator();
        try{
            obj.ValidateAge(15);
        }
        catch(InvalidateAgeExcep ag){
            System.out.println(ag.getMessage());
        }
        System.out.println("over and out");
    }
}
