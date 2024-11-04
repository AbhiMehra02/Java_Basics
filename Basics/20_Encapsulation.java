/*
 * Encapsulation ->private obj/methods are access inside class itself only.
 */

class Human
{
    private int age;
    private String name;
    
    // right click ->source action ->getter setter -> select variable to genrate get and set methods
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


    // public int getAge(){
    //     return age;
    // }

    // public void setAge(int a){
    //     age=a;
    // }

    // public String getName(){
    //     return name;
    // }

    // public void setName(String n){
    //     name=n;
    // }

    

}

class Encapsulation 
{
    public static void main(String[] args) {
        Human obj =new Human();

        // obj.age =11;
        // obj.name ="Yamada";
        obj.setAge(13);
        obj.setName("Yamada");
        System.out.println(obj.getAge() + " " +obj.getName());
    }    
}
