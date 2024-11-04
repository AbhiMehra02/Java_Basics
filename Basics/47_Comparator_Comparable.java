import java.util.ArrayList;
// import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class Student //implements Comparable<Student>
{
    int age ;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }


    // @Override
    // public int compareTo(Student that) {
    //    if(this.age >that.age) return -1;
    //    else return 1;
    // }



}

class Demo
{
    public void demo()
    {
        Comparator<Integer> com =new Comparator<Integer>() {
            public int compare(Integer i,Integer j){
                if(i%10 >j%10)
                    return 1;
                else 
                   return -1;
            }
        };

        List<Integer> nums =new ArrayList<>();
        nums.add(64);
        nums.add(57);
        nums.add(88);
        nums.add(12);

        // Collections.sort(nums);

        Collections.sort(nums,com);

        System.out.println(nums);
    }

    public void stud()
    {
        Comparator<Student> com =(Student i,Student j) -> i.age <j.age ? 1:-1;


        List<Student> studs =new ArrayList<>();
        studs.add(new Student(21, "jim"));
        studs.add(new Student(45, "eddy"));
        studs.add(new Student(100,"venom"));
        studs.add(new Student(23,"Tom" ));

         //Note: without compareTo that code won't work , for Integer class already implents Comparable that by by default it will work
        // Collections.sort(studs);
        Collections.sort(studs,com);

        // System.out.println(studs);

        for(Student s :studs){
            System.out.println(s);
        }

    }
}

class Comparator_Comparable {
   public static void main(String[] args) {
    Demo dm = new Demo();
    // dm.demo();


    dm.stud();


   } 
}
