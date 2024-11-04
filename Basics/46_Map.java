import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

class MAP {
    public static void main(String[] args) {
        // Map<String,Integer> students = new HashMap<>(); 
        Map<String,Integer> students = new Hashtable<>(); // it is Sychronized : for multiple thread

        students.put("jimmy",56);
        students.put("david", 47);
        students.put("jack",36);
        students.put("Troy", 79);
        students.put("jack",67);

        // System.out.println(students);
        // System.out.println(students.get("Troy"));

        // System.out.println(students.keySet());

        for(String name: students.keySet()){
            System.out.println(name + " " + students.get(name));
        }

    }
}
