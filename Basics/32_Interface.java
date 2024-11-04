// note: interface is not class
// by default all are is public
// methods that are define in interface is neccessary to add in implements
// by default interface variable are final and static

// class - class -> extends
// class - interface -> implements
// interface -interface -> extends

interface A{
  
    int age=44;       // final and static
    String area="Mumbai";

    void show();
    void config();
}

interface X
{
  void run();
}


interface Y extends X
{

}

// class B implements A,X
//  or  , both work same
class B implements A,Y
{

   public void show()
   {
     System.out.println("in show");
   }

   public void run()
   {
     System.out.println("in run");
   }

   public void config()
   {
     System.out.println("in config");
   }
  
}
class Interface 
{
    public static void main(String[] args) 
    {       
        A obj = new B();

        obj.config();
        obj.show();

        // not work
        //A.age =25;

        // System.err.println(A.age);
        // System.err.println(A.area);

        // not work
        // obj.run();


        X obj1= new B();
        obj1.run();

    }    
}
