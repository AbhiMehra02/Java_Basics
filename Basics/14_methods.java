class Computer 
{   

    public void playMusic()
    {
        System.out.println("Music Playing");;
    }

    public String getMeApen(int cost)
    {
        if(cost>= 10)
            return "pen";
        else 
            return "Nothing";
    }
}

// methods overloading
class Calculator
{   
    public int  add(int n1,int n2)
    {
        return n1 + n2;
    }    
    
    public int add(int n1,int n2, int n3)
    {
    return n1+ n2+ n3;
    }

    public double add(double n1,int n2)
    {
        return n1 + n2;
    }
}
 

class Methods {
    public static void main(String[] args) {
        // Computer Comp =new Computer();
        // Comp.playMusic();
        // String str = Comp.getMeApen(2);
        // System.out.println(str);

        Calculator calc=new Calculator();

        int r=calc.add(3, 4);

        System.out.println(r);

    }
}
