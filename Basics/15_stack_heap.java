class Calculator
{   
    int num=5; // instance variable, stored in the heap as part of the Calculator object
    public int add(int n1, int n2) // 'add' method reference is on the heap, but its local variables (n1, n2) and 'return' value are on the stack during execution.
    {
        // System.out.println(num); // 'num' is accessed from the heap.
        return n1 + n2; // 'n1' and 'n2' are in the stack while 'add' is executing.
    }    
}
 

class stack_heap 
{
    public static void main(String[] args) 
    {
        int data = 10;  // 'data' is a local variable stored in the stack.

        Calculator obj = new Calculator(); // 'obj' is a reference variable stored in the stack, but the actual Calculator object is created in the heap.
        
        int r1 = obj.add(3, 4); // 'r1' is stored in the stack, '3' and '4' are passed to 'add', and the result is returned and stored in 'r1'.
        // System.out.println(r1);


        Calculator obj1 =new Calculator();

        obj.num=10;
        
        System.out.println(obj.num);
        System.out.println(obj1.num);

    }
}
