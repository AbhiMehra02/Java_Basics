
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


class Collection_Set {
    public static void main(String[] args) {
        Collection<Integer> nums =new TreeSet<Integer>(); 

        // Set<Integer> nums =new HashSet<Integer>(); // 
        // Set<Integer> nums =new TreeSet<Integer>(); // to get values in sorted order
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(1);
        nums.add(6);

        // System.out.println(nums);

        // for(int n:nums) 
        //     System.out.println(n);

        Iterator<Integer> values =nums.iterator();

        // System.out.println(values.next());

        while (values.hasNext()) {
            System.out.println(values.next());   
        }

    }
    
}
