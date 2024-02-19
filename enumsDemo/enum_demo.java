package enumsDemo; // as in enums folder
enum week {
sunday,monday,tuesday,wednesday,thursday,friday,saturday;
}


public class enum_demo {
    public static void main(String a[]){

        //to access single enum constant
        week w1=week.monday;
        System.out.println(w1);
        //to see the order/index
        System.out.println(w1.ordinal());

        week[] w =week.values(); // as week.values() returns arr[] so we consider as week[] w
        for(week i : w){
            System.out.println(i + " " + i.ordinal());
        }
    }
}
