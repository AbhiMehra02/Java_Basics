import java.util.Arrays;
import java.util.List;
// import java.util.function.Consumer;
import java.util.stream.Stream;;

class Demo
{
    public void enhan_normal()
    {
        List<Integer> nums = Arrays.asList(4,5,7,2,6);

        int sum=0;
        
        // Enhanced for loop
        // for(int n:nums){
        //     if(n%2==0){
        //         n=n*2;
        //         sum +=n;
        //     }
        // }
        // System.out.println(nums);
        // System.out.println(sum);

        // normal for loop
        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

        
        // nums.forEach(n->System.out.println(n));

    }

    public void  for_each(){
        List<Integer> nums = Arrays.asList(4,5,7,2,6);

        // Consumer<Integer> con =new Consumer<Integer>() {
        //     public void accept(Integer n)
        //     {   
        //         System.out.println(n);
        //     }
        // };
        // nums.forEach(con);

        // Consumer<Integer> con =n -> System.out.println(n);
        // nums.forEach(con);

        nums.forEach(n -> System.out.println(n));
         
    }

    public void Stream()
    {
        List<Integer> nums = Arrays.asList(4,5,7,2,6);

        // it won't change Original
        // once the stream is used , can't reused it
        Stream<Integer> s1 = nums.stream();

        //s1.forEach(n -> System.out.println(n));

        // IllegalStateException: stream has already been operated upon or closed
        // s1.forEach(n -> System.out.println(n));

        Stream<Integer> s2 =s1.filter(n -> n%2==0);
        // s2.forEach(n -> System.out.println(n));

        Stream<Integer> s3 =s2.map(n -> n*2);
        // s3.forEach(n -> System.out.println(n));
        
        int res =s3.reduce(0,(c,e)->c+e);
        System.out.println(res);
    }


    public void Streaminline()
    {
        List<Integer> nums = Arrays.asList(4,5,7,2,6);


        int res =   nums.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0,(c,e)->c+e);

        System.out.println(res);
    }


}
class StreamAPI {
    public static void main(String[] args) {
        Demo dm=new Demo();
        // dm.enhan_normal();
        // dm.for_each();
        // dm.Stream();
        dm.Streaminline();
    }
}
