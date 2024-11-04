/*
 * if we use main function code last and run using file name it won;t work.
 * but it will run when function code put top ..
 */

class  Class_Objects 
{
    public static void main(String a[] ) 
    {
        Calculator Calc=new Calculator();
        int res=Calc.add();
        System.out.println(res); 
    }
}


class Calculator
{   
    int a;
    public int  add()
    {
        System.out.println("in add");
        return 0;
    }    
}
