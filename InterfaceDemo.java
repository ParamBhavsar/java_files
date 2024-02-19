interface laptop
{
    public void code();
}
class windows_lap implements laptop
{
    public void code(){
        System.out.println("coding in windows os");
    }
}
class mac_book implements laptop
{
    public void code(){
        System.out.println("coding in mac os");
    }
}

class Developer
{
    public void codes_on(laptop lap){
        lap.code();
    }
}
public class InterfaceDemo {
    public static void main(String a[]){
       laptop mac =new mac_book();
       laptop windows = new windows_lap();
       
       Developer param =new Developer();
       param.codes_on(windows);
       param.codes_on(mac);
    }
}
