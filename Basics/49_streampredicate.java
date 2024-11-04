import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

class Demo
{

    public void Streaminline()
    {
        List<Integer> nums = Arrays.asList(4,5,7,2,6);

        // filter
    
        // Predicate<Integer> p=  new Predicate<Integer>() {
        //     public boolean test(Integer n){
        //         return n%2==0;
        //     }
        // };

        Predicate<Integer> p= n -> n%2==0;

        // Map
        // Function<Integer,Integer> fun = new Function<Integer,Integer>() {
        //     public Integer apply(Integer n){
        //         return n*2;
        //     }
        // }; 

        Function<Integer,Integer> fun = n -> n*2;

        // Reduce

        

        int res =   nums.stream()
                        .filter(p)
                        .map(fun)
                        .reduce(0,(c,e)->c+e);

        System.out.println(res);
    }

    public void sort2()
    {
        List<Integer> nums = Arrays.asList(4,5,7,2,6);

        Stream<Integer> sortedValue =nums.stream()
                                         .filter(n->n%2==0)
                                         .sorted();
        

        sortedValue.forEach(n -> System.out.println(n));
    }       
    
}
class streampredicate{
    public static void main(String[] args) {
        Demo dm=new Demo();

        // dm.Streaminline();
        dm.sort2();
    }
}
