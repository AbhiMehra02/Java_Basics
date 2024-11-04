class Error
{
    public void Demo()
    {
        // compile time error
        // System.out.Println(); 

        // logical error 
        // getting 5 insted of 4 
        // System.out.println(2+3); 

        // runtime error -> Exceptions
        /*
         * that were co we running some file isn't there 
         */


    }
}


class ZeroException extends Exception
{
    public ZeroException(String string){
        super(string);
    }   
}

class ExceptionHandling
{
    public void demo()
    {   
        int  i=9;
        // int i=0;
        int j=8/i; // ritical when i=0 ,Note: error get in this line to assinging  j to 8/0;
        System.out.println(j);
    }  

    public void TryCatch()
    {   
        int  i=0;
        int j=0;

        try
        {
            j=18/i;
        }
        catch (Exception e)
        {
            System.out.println("Something went Wrong" + e); 
        }

        System.out.println(j);
        // System.out.println(""); 

    }   

    
    public void TryMultiple()
    {  




        int  i=2;
        int j=0;

        int nums[ ]=new int[5];
        String str =null;

        try
        {
            j=18/i;           
            System.out.println(str.length()); 
            System.out.println(nums[1]);
            System.out.println(nums[5]);            
        }
        catch (ArithmeticException e)
        {    
            System.out.println("Cannot divide by zero"); 
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("array index isn't in range"); 
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.." + e); 
        }
        System.out.println(j);
        // System.out.println(""); 
    }   

    public void ThrowException()
    {


        int i=20;
        int j=18;

        try{
            j=18/i;

            // try  to create error
            // if(j==0)
            //     throw new ArithmeticException("value won't converge to zero");
            
            // creating By own Exception
            if(j==0)
                throw new ZeroException("value won't converge to zero");
        }
        catch(ZeroException e){
            j=18/1;
            System.out.println("Default Output.." +e); 
        }
        catch(Exception e)
        {
            System.out.println("Something went wrong.." + e); 
        }

        System.out.println(j);   
    }

     

}

class ExcepTion {
    public static void main(String[] args) {
        // Error Er =new Error();
        // Er.Demo();

        ExceptionHandling Ehand =new ExceptionHandling();
        // Ehand.demo();
        // Ehand.TryCatch();
        // Ehand.TryMultiple();

        Ehand.ThrowException();




    }
}

