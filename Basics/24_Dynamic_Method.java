/*
 *  polymorphism (many behavoir)
 *   1. Compile time   (Early binding) (Overloading)
 *   2. Run Time      (late binding)  (Overriding)
 * 
 * ex  of  1:
 *   add(int,int) , add(int,int,int)
 * 
 * ex of  2: A& B are classes
 *   add(int,int)  (A)<-(B)    add(int,int) 
 */


class A
{
    public void show()
    {
        System.out.println("in A  Show");
    }

} 

class B extends A
{
    public void show()
    {
        System.out.println("in B Show");
    }

}

class C extends A
{
    public void show()
    {
        System.out.println("in C Show");
    }

}

class D
{

}
class Method_Dispatch {
    public static void main(String[] args) {
        // type as parent and object as child;
        // A obj =new B();
        // obj.show();
        
        A obj =new A();
        obj.show();

        // that is only work when it is(B) is child class of A   
        obj =new B();
        obj.show();

        obj =new C();
        obj.show();

        // that will not work
        // obj =new D();

    }
}
 