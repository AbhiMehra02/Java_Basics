// to genrate constructor : right click ->source action ->Constructor -> select variable to genrate it.

class Human
{

    private int age;
    private String name;
    
    // default Construtor
    public Human()
    {
       age=12;
       name ="john";
    }

    ///parametrized constructor
    public Human(int age,String name)
    {
       this.age=age;
       this.name =name;
    }    

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // for demo anonymous object
    public void show()
    {
        System.out.println("in A show");
    }


}
 
// by default string : null ans int =0;
class Constructor 
{
    public static void main(String[] args) {

        Human obj =new Human();
        Human obj1 =new Human(18,"Sam");

        System.out.println(obj.getAge() + " " +obj.getName());
        System.out.println(obj1.getAge() + " " +obj1.getName());

        // annonymus object
        // new Human().show();
    }    
}

// Camel Casing

// class name and interface -> 'C'alc :start with capital letter , Runable
// variable and method -> marks, show()
// constant - PIE - all letter are capital , BRAND


// ex.
// showMyMarks() , show_My_Marks()

// class name : MyData