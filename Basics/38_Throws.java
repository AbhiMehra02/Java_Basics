

class A
{
    public void show(){
                
        try{
            Class.forName("Throw");
        }
        catch(ClassNotFoundException e){
            System.out.println("Not find class " + e);
        }

    }


    public void  show2() throws ClassNotFoundException
    {
        Class.forName("Throws");
    }

}
class Throws
{
    static {
        System.out.println("Class Loaded");;
    }

    // method 1
    // public static void main(String[] args) throws ClassNotFoundException{

    // method 2 write try and catch 
    public static void main(String[] args) {
            A obj =new A();
            // obj.show();
            try{
                obj.show2();
            }
            catch(ClassNotFoundException e){
                e.printStackTrace();
            }
    }
}