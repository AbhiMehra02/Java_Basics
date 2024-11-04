

enum Status
{
    Running,Failed,Pending, Success;  
}

class Enum2
{
  public static void main(String[] args) {

    Status s = Status.Pending;
    // System.out.println(s.getClass().getSuperclass());
    
    // if(s==Status.Running)
    //     System.out.println("All Good");
    // else if(s==Status.Failed)
    //     System.out.println("Try again");
    // else if(s==Status.Pending)
    //     System.out.println("please wait");
    // else 
    //     System.out.println("Done");

    switch (s) {
        case Running:
            System.out.println("All Good");
            break;
        case Pending:
            System.out.println("please wait");
            break;
        case Failed:
            System.out.println("Try again");
            break;
        case Success:
            System.out.println("Done");
            break;
        default:
            break;
    }



  }   
}


