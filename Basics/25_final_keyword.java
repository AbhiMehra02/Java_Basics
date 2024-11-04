// final - variable , method, class

/*
 * Class : to stopping the inheritance so no one can extended 
 * Variable: to make it constant
 * method : to stop overriding
 */

class Calc
{
    void Const(){
        final int num=8;
        //  num=9;  // get error
        System.out.println(num);
    }

    public final void show() {
        System.out.println("in a Calc show");   
    }

    public void add(int a,int b){
        System.out.println(a+b);
    }
    
}

final class AdvCalc extends Calc
{
    // got an error
    // public  void show() {
    //     System.out.println("in a AdvCalc show");   
    // }

    public  void show2() {
        System.out.println("in a AdvCalc show");   
    }


}

//error: cannot inherit from final AdvCalc
// class Scientifi extends AdvCalc
// {
// }


class FinalKeyword 
{
    public static void main(String[] args) {
    
        // Calc obj =new Calc();
        // obj.Const();
        // obj.show();
        // obj.add(5, 11);

        AdvCalc obj =new AdvCalc();
        obj.show();
        obj.add(4, 9);

    }    
}
