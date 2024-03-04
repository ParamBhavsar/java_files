package Fundamentals;

class demo {
    int a,b;
    
    demo(int a , int b){
        this.a=a;
        this.b=b;
    }
    
    public void SwapCallByReference(demo obj){
        int c = obj.a;
        obj.a=obj.b;
        obj.b=c;
    }
}

public class CallBy
{
    public static void SwapCallByValue(int a , int b){
        int temp = a;
        a=b;
        b=temp;
        System.out.println("inside call by value fn :"+a+" "+b);
    }
    
	public static void main(String arr[]){
	    
	    int a = 5;
	    int b =10;
	    demo obj = new demo(a,b);
	    System.out.println(obj.a+" "+obj.b);
	    obj.SwapCallByReference(obj);
	    System.out.println(obj.a+" "+obj.b);
	    
	    int x = 2;
	    int y = 3;
	   System.out.println("before call by value:"+x+" "+y);
	   SwapCallByValue(x,y);
	    System.out.println("outside call by value fn :"+x+" "+y);
	}
}
