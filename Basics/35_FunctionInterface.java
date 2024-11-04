@FunctionalInterface
interface A
{
    void show();
}

// class B implements A
// {
//     public void show()
//     {
//         System.out.println("in a Show");
//     }
// }

class FunctionInterface {
    public static void main(String[] args) {
        A obj =new A() {
            public void show()
            {
                System.out.println("in  Show");   
            }
        };

        obj.show();
    }
}
