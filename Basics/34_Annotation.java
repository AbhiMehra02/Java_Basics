class A
{   
    // public void show()
    // {
    //     System.out.println("in A show");
    // }

    public void showTheDataWhichBelongsToThisClass()
    {
        System.out.println("in A show");
    }

}

class B extends A
{

    @Override
    public void showTheDataWhichBelongsToThisClass() {
        // TODO Auto-generated method stub
        super.showTheDataWhichBelongsToThisClass();
    }
    // public void show()
    // {
    //     System.out.println("in B show");
    // }

    // @Override 
    // public void showTheDataWhichBelongsToThisClass()
    // {
    //     System.out.println("in B show");
    // }

}


class Annotation {
    public static void main(String[] args) {
        B obj =new B();
        // obj.show();

        obj.showTheDataWhichBelongsToThisClass();
    }

}
