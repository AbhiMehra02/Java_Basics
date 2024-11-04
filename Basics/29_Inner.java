
class A
{
    int age;
    public void show()
    {   
        System.out.println("in a show");
    }

    class B
    {
        public void config()
        {   
            System.out.println("in a config");
        }
    }

    static class C
    {
        public void showc()
        {   
            System.out.println("in a show C");
        }

    }
}

class Inner
{
    public static void main(String[] args) {
        A obj =new A();
        obj.show();

        // create of object of inner class first need to create the object of outer class
        A.B obj1 =obj.new B();
        obj1.config();

        // for static inner class not reuired to create object of outer class
        A.C obj2 = new A.C();
        obj2.showc();

       // outer class must not static

    }
}