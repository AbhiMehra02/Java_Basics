import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Demo
{
    // finally : always run irrespective of error got or not.
    // finally : to close resource
    // after try directly can write finally there is no mendatory things to write catch after try
    public void trycatchfinally(){
        int i=0;
        int j =0;

        try{
            j=18/i;
        }
        catch (Exception e){
            System.out.println("Something Wrong");
        }
        finally{                                
            System.out.println("Bye");       
        }                                       

        System.out.println(j);
    }


    public void tryfinally() throws NumberFormatException, IOException {
        int num=0;
        BufferedReader br =null;
        
        try
        {
            // InputStreamReader in  = new InputStreamReader(System.in);
            // br = new BufferedReader(in);

            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
        finally
        {
            br.close();
        }
    }

    public void tryfinally2() throws NumberFormatException, IOException {
        int num=0;

        // once try is over resource automatically closed
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) )
        {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }

}

class TryResource {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        Demo dm =new Demo();
        // dm.trycatchfinally();
        dm.tryfinally();
    }    
}
