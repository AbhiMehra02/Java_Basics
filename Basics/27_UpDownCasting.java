
class TypeCasting
{
    public void show(){
        double d=4.5;
        int i = (int)d;
        System.out.println(i);
    }    
}

class A
{
    public void show1(){
        System.out.println("in  A  show");
    }   
}

class B extends A
{
    public void show2(){
        System.out.println("in  B  show");
    }   
}

class UpDownCasting 
{
    public static void main(String[] args) {
        // TypeCasting Tc=new TypeCasting();
        // Tc.show();

        // A obj = new A();
        // obj.show1();
        

        A obj =(A)new B(); //Upcasting 
        obj.show1();
        
        // B obj1 = obj;
        // obj1.show2();

        
        B obj1 = (B)obj; //DownCasting
        obj1.show2();
        
    }    
}
