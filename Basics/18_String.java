
class String_Methods
{
    public void Demo_String()
    {
        // String name ="Abhi"

        String name =new String("Abhi"); // in java String is class not object
        
        System.out.println(name);
        
        //System.out.println(name.hashCode());

        // System.out.println("hello" + name);

        // System.out.println(name.concat("Hii"));

    }

    public void Mutable_Immutable() {
        String name = "trex";  
        name = name + " vei";
        System.out.println("hello " + name);
    
        String s1 = "Trex";
        String s2 = "Trex";
    
        /*
          Mutable string -> changeable
          Immutable string -> unchangeable (by default in Java)
        */
    
        /*
         *  Stack and Heap memory representation:
         *  
         *  Stack                   Heap
         *              Initial State
         *  s2   - 103                103 - "Trex"  
         *  s1   - 103                
         *  name - 101                101 - "trex"
         *  
         *           After updating `name`
         *  s2   - 103                103 - "Trex"  
         *  s1   - 103                101 -"trex" (eligible for garbage)          
         *  name - 105                105 - "trex vei"
         */ 
    }

    public void Buffer_Builder()
    {
        // StringBuffer sb =new StringBuffer();
        // StringBuffer sb1 =new StringBuffer("Jack");
      
        // System.out.println(sb.capacity());
        // System.out.println(sb1.capacity());

        // System.out.println(sb.length());
        // System.out.println(sb1.length());
        
        StringBuffer sb2 =new StringBuffer("Jack");

        sb2.append(" Vei");
        System.out.println(sb2);
        
        // sb2.deleteCharAt(1);
        // System.out.println(sb2);

        // sb2.insert(0, "Jave ");
        // System.out.println(sb2);

        // sb2.insert(5, "Jave ");
        // System.out.println(sb2);

        // System.out.println(sb2.length());
        // sb2.setLength(30);
        // System.out.println(sb2.length());
        // sb2.ensureCapacity(100);
        // System.out.println(sb2.length());

        // String str = sb2.toString();

    }
}

class STring 
{
    public static void main(String[] args) 
    {
        String_Methods Str = new String_Methods();


        // Str.Demo_String();

        // Str.Mutable_Immutable();

        Str.Buffer_Builder();

    }    
}
