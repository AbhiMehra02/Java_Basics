/*
 * like Integer we have , Double, Float,Charater
 * 
 */

class wrapper
{

    public void Wrap()
    {
        int num =7;
        // Integer num1 =new Integer(num); // boxing : primitive value stored in a wrapper/class object
        Integer num1 =num; // autoboxing

        // int num2 =num1.intValue(); //  unoboxing
        int num2 =num1; //  auto -unoboxing
        System.out.println(num2);

        String str ="12";
        int num3 = Integer.parseInt(str);
        System.out.println(num3*2);
    }
}

// Abstract Keyword
// abstract method are only available in abstract class

// abstract method must be necessary in abstract class but vice versa isn't true.
abstract class Car
{
    public abstract void drive();
    public abstract void fly();

    public void playMusic()
    {
        System.out.println("play music");
    }
}

abstract class WagonR extends Car
{   
    public void drive(){
        System.out.println("Driving..");
    }

    // public void fly(){
    //     System.out.println("Flying..");
    // }

}

class UWagonR extends WagonR
{

    public void fly(){
        System.out.println("Flying..");
    }

}

class Wrapper_AbstractKeyword {
    public static void main(String[] args) {
        // wrapper W =new wrapper();
        // W.Wrap();

        // can't create object of abstract class
        // Car obj=new Car();

        // Car obj=new WagonR();
        // obj.drive();
        // obj.playMusic();


        Car obj=new UWagonR();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
