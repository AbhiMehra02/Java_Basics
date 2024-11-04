import other.*;

// can't have to public classes in same file

class C extends A
{
    public void abc()
    {
        System.out.println("Outside the package (Subclass) "+marks3);
    }   
}

public class Modifier 
{    
    public static void main(String[] args) {
       

        A obj =new A();
        System.out.println(obj.marks);  
        // System.out.println(obj.val);
        
        obj.show();


        // B obj1 =new B();
        // System.out.println(obj1.marks);   
    }
}
