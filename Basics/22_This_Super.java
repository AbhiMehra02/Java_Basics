//Note : by default every constructor : first statement is super
 

class A extends Object
{
    public A()
    {
        //super();
        System.out.println("in A");
    }

    public A(int n)
    {
        //super();
        System.out.println("int A");
    }
}

class B extends A
{
    public B()
    {
        //super();
        System.out.println("in B");
    }

    public B(int n)
    {
        // super();  // by default
        // super(n); // pass super class constructor a parameter

        this(); //it will execute the constructor of same class
         
        System.out.println("int B");
    }
}


class This_Super 
{
    public static void main(String[] args) 
    {
    //    B obj = new B();

    //    B obj = new B(5);
    }    
}
