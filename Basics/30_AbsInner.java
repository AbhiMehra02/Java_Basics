/**
 * Abstract Anonymoius
 */

class A
{
    public void show(){
        System.out.println("in A Show");
    }

    public void show1(){
        System.out.println("in A Show");
    }
}

class B extends A
{
    public void show(){
        System.out.println("in B Show");
    }
    public void show1(){
        System.out.println("in B Show");
    }

}

class AbsAno 
{

    public static void main(String[] args) {
        
        // A obj = new A();
        // obj.show();

        // overriding ,only when the function name is same in both class (parent & child)
        //  only able to use parent class function not the child class (here i called A is parent ans B is child)
        // A obj1 = new B();
        // obj1.show(); //  runtime polymorphism or dynamic method dispatch.
        
        // B obj2 =new A() ; type mismatch

        // Anonymous class
        A obj3 =new A()
        {
            public void show()
            {
                System.out.println("in new show");   
            }
        };

        obj3.show();

    }
    
}