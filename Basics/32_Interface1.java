interface Computer
{
    void code();
}

class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code,compile,run");
    }
}

class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code,compile,run : faster");
    }
}

class Developer
{
    public void devapp(Computer lap){
        lap.code();
    }
}


class Interface1 {
    
    public static void main(String[] args) {
        Computer lap =new Laptop();
        Computer desk=new Desktop();

        Developer Abhi =new Developer();
        Abhi.devapp(lap);
    }
}
  