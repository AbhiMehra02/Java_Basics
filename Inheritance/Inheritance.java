
// [parent, super, base] <--- [child, sub , derived]  , child inherit the traits of parent

//method 1
// class Calc
// {
//     public int add(int n1,int n2){
//         return n1+n2;
//     }

//     public int sub(int n1,int n2){
//         return n1-n2;
//     }
// }

// public class AdvCalc  extends Calc
// {

//     public int multi(int n1,int n2){
//         return n1*n2;
//     }

//     public int div(int n1,int n2){
//         return n1/n2;
//     }
// }

// Or create seprate java file 


public class Inheritance 
{
    
    public static void main(String[] args) {
        VeryAdCalc obj =new VeryAdCalc();   

        int r1 =obj.add(4, 5);
        int r2= obj.sub(7, 4);
        int r3 =obj.multi(2, 5);
        int r4= obj.div(8, 4);
        double r5= obj.power(8, 4);


        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " "+ r5);
    }
}


