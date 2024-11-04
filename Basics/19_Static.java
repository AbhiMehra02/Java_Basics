class Mobile
{
    String brand; 
    int price;   
    static String name; // by all object of Mobile 
    // static variable ->methods of class , not object of class

    // static block  ->call at once
    static
    {
        name="Phone";
        System.out.println("In static Block");        
    }

    // constructor
    public Mobile()
    {
        brand= "";
        price =200;
        System.out.println("in constructor"); 
    }

    public void show()
    {
        System.out.println(brand + " : " + price + " " +  name);
    }

    /*
     *  non static method able to use both varible static and non-static 
     *  
     *  Inside static method only able to use static variables 
     *  to use non static variable  inside staice methods you have pass those variables in it 
     */

    // static method
    public static void show1(Mobile obj)
    {
        System.out.println(obj.brand + " : " + obj.price + " " +  name);
        // System.out.println("static methods");
    }
}

class Static_func
{
    public void static_methods()
    {
        Mobile obj1 = new Mobile();
        obj1.brand ="Apple";
        obj1.price =1500;
        Mobile.name ="Smartphone";  // static variable can also access through class name

        Mobile obj2 = new Mobile();
        obj2.brand ="Samsung";
        obj2.price =1700;
        Mobile.name ="Smartphone";

        Mobile.name ="Phone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);
    }

    public void static_demo() throws ClassNotFoundException{
        // Mobile obj1 = new Mobile();
        // Mobile obj2 = new Mobile();

        // load the class 
        Class.forName("Mobile");
    }


}


class Static {
    public static void main(String[] args) throws ClassNotFoundException {
        Static_func stf= new Static_func();

        // stf.static_methods();

        stf.static_demo();
    }
}
