class obj_class
{
    int model_no;
    String name;

    public String toString() {
        return model_no + " " + name;
    }

    public int hashCode(){
        return 2004;
    }
}
class obj_class1
{
    public static void main(String args[]){
        obj_class obj = new obj_class();
        obj.model_no=123;
        obj.name="dell";
        System.out.println(obj);  // it automatically call obj.toString();
        System.out.println(obj.hashCode()); // is Object.class but we modified according to our need

    
        obj_class obj1 = new obj_class();
        obj1.model_no=123;
        obj1.name="dell";
        System.out.println(obj.equals(obj1));
    }
}

