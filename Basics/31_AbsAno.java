
abstract class A
{
    public abstract void show();
    public abstract void config();
}

// comment-1
// class B extends A
// {
//     public void show(){
//         System.out.println("in B show");
//     }   
// }
class AbsAno 
{
    public static void main(String[] args) 
    {

        // uncomment comment-1         
        // A obj =new B();
        // obj.show();
        
        A obj =new A()
         {
            public void show(){
                System.out.println("in new Show");
            }

            public void config()
            {
                System.out.println("in new config");
            }
        };
        obj.show();
        obj.config();
    }    
}
