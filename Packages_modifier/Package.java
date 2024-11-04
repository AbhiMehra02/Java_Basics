import other.tools.Calc;
import other.tools.AdvCalc;
//  import java.util.ArrayList;
// import tools.*;
// java.lang.*;

// import other.*;

public class Package 
{    
    public static void main(String[] args) {
        // ArrayList list =new ArrayList();
        Calc obj =new Calc();
        AdvCalc obj1 =new AdvCalc();

        System.out.println(obj.add(3, 5));
        
        System.out.println(obj1.sub(2, 1));
    }
}
