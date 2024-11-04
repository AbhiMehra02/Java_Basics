package other;

class Lauch
{
    public void abc()
    {
        A obj =new A();
        System.out.println("Same Packages (Protected ):" + obj.marks3);        
    }

}
public class A {
    public int marks=6;
    // private int marks2=11;
    protected int marks3=20;

    public void show(){

    }

}
