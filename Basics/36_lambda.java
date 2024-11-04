@FunctionalInterface
interface A
{
    // void show();
    void show(int i);
}

class Lambda{
    public static void main(String[] args) {

        // for single
        // A obj =() -> System.out.println("in  Show");   

        // for multiple 
        // A obj =() -> 
        //     {
        //         System.out.println("in  Show");   
        //     };

        // for multilpe variable 
        // A obj =(i) -> System.out.println("in  Show "+ i);

        //single variables
        A obj = i-> System.out.println("in  Show "+ i);
        

        obj.show(5);
    }
}
