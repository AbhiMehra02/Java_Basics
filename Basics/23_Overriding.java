class Calc
{
    public int add(int n1,int n2)
    {
        return n1+n2;
    }

    public void show()
    {
        System.out.println("in A show");
    }
}

class AdvCalc extends Calc
{
    // overriding methods
    public int add(int n1,int n2)
    {
        return n1+n2+1;
    }

    public void show() 
    {
        System.out.println("in B show");
    }


}

class Overriding {
    public static void main(String[] args) {
        AdvCalc obj =new AdvCalc();

        int r1 =obj.add(2, 3);
        System.out.println(r1);

       // obj.show();  // give prefrence their own methods rather than super
    }
}
