// println : method of PrintStream.class
// out : object of PrintStream class
// out object is static  variable created inside System class
// it's static that  is why is we excess through class name (System)


// in : object of InputStream class

import java.io.IOException;
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.util.Scanner;

class UserInput {

    public static void main(String[] args) throws IOException {


        System.out.println("Enter a number");
        
        // int num = System.in.read(); // it give ASCII value
        // System.out.println(num-48);


        // // take input from anywhere file, network etc..
        // InputStreamReader in =new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        
        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close(); // not mendatory , but good practice

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);
        sc.close();


    }
    
}
