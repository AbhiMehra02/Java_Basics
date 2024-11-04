/*
 * int ->byte not work 
 * but, byte to int is work , due range of int > range of byte
 */

class ConversionCasting 
{
    public static void main(String args[])
    {
        // byte b = 126;
        // int a = 256;
        
        // //a = b;  // Implicit conversion from byte to int
        // b = (byte) a; // Explicit casting required for converting int to byte

        // System.out.println("Value of a after assigning byte b: " + a);

        float f=5.6f;
        int x=(int)f;
        System.out.println(x);

    }
}
