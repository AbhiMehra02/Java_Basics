@FunctionalInterface
interface A
{
    int add(int i,int j);
}

class Lambda2{
    public static void main(String[] args) {
        // A obj = new A()
        // {
        //     public int add(int i,int j){
        //         return i+j;
        //     }
        // } ;
        
        A obj = (i,j) -> i+j;

        int res=obj.add(5,10);
        System.out.println(res);
    }
}
