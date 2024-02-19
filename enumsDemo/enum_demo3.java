package enumsDemo;
// can create constructor in enums as gym_essentials is type of a class 
// all these dumbells rope ... etc works as constructor so to use them we need to define them

enum gym_essentials{
    dumbells() , rope() , barbell() , pullup_bar() , plates() ;
    private int price;

    private gym_essentials(){   // cannot use public constructor here 
         price=200;             // will default set price as 200rs
    }

    public void set_price(int ip_price){
        this.price=ip_price;
    }

    public int get_price(){
        return price;
    }
}

public class enum_demo3 {
    public static void main(String[] args) {
            
        gym_essentials weights = gym_essentials.dumbells;

            weights.set_price(1500);
            int price=weights.get_price();
            System.out.println(price+" "+"Rs");

            gym_essentials p=gym_essentials.barbell;
            p.set_price(1800);

            // to print out all
            gym_essentials[] g = gym_essentials.values();
            for(gym_essentials i : g ){
                System.out.println(i + " " + g[i.ordinal()].get_price());
            } // as we use arr[i]  lyy, g[i.ordinal]
        
    }
}
