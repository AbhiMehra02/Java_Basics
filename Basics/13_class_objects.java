// javac 13_class_objects.java
// java Class_Objects

class Calculator
{   
     int a;
     public int  add(int n1,int n2)
     {
         int  res =n1 + n2;
         return res;
     }    
 
}
 
class  Class_Objects 
{
    public static void main(String a[] ) 
    {
        int num1 = 4;
        int num2 = 5;
        
        Calculator Calc=new Calculator();
        int res=Calc.add(num1,num2);
        System.out.println(res);
    }
    
}


