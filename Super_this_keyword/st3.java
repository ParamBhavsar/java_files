package Super_this_keyword;
// so this keyword makes execute this (current) constructor instead of defualt super()
// ie. will call the constructor of same class
class x{
    public x(){
        System.out.println("in x");
    }
    public x(int a){
        System.out.println("in int x");
    }
}
class y extends x{
    public y(){
        System.out.println("in y");
    }
    public y(int a){
        this(); // so will execute constructor of this class first ie.goes to y=>execute x due to y=>this makes execute only this method ie.int y
        System.out.println("in int y");
    }
}

public class st3 {
        public static void main(String[] args) {
            y obj = new y(5);
            // in x
            // in y
            // in int y
        }
}
