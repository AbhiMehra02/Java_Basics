/*
 * Collection API :
 * Collection     : interface
 * Collections    : class
 */

/*
  collection -> List , Queue, Set, Map
  List -> ArrayList ,LinkedList
  Queue -> Queue
  Set -> Hashset LinkedHashset

 */ 
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class Coll_list
{
    public void coll()
    {


        Collection<Integer> nums =new ArrayList<>();

        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(1);

        // System.out.println(nums);

        // for(int n:nums) 
        //     System.out.println(n);

    }

    public void list()
    {
        // Creating an ArrayList of integers
        List<Integer> nums = new ArrayList<>();

        // Adding elements
        nums.add(10);  // adds 10 at index 0
        nums.add(20);  // adds 20 at index 1
        nums.add(30);  // adds 30 at index 2
        nums.add(40);  // adds 40 at index 3
        
        System.out.println("Original List: " + nums);
        
        // Accessing an element by index
        int elementAtIndex2 = nums.get(2);  // get element at index 2
        System.out.println("Element at index 2: " + elementAtIndex2);
        
        // Modifying an element at a specific index
        nums.set(1, 25);  // sets element at index 1 to 25
        System.out.println("List after setting index 1 to 25: " + nums);
        
        // Removing an element by index
        nums.remove(3);  // removes the element at index 3 (which is 40)
        System.out.println("List after removing element at index 3: " + nums);
        
        // Finding the index of an element
        int indexOf30 = nums.indexOf(30);  // finds index of 30
        System.out.println("Index of 30: " + indexOf30);
        
        // Checking if the list contains a specific element
        boolean contains20 = nums.contains(20);  // checks if 20 is in the list
        System.out.println("List contains 20: " + contains20);
        
        // Iterating over the list
        System.out.println("Iterating over the list:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Clearing all elements in the list
        nums.clear();
        System.out.println("List after clearing: " + nums);
    }
}

class Collection_list {
    public static void main(String[] args) {

        Coll_list lt = new Coll_list();
        // lt.coll();
        lt.list();
    }
}
