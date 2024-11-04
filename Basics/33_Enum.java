// // these constant are available

enum Status
{
    Running,Failed,Pending, Success;  
}

class Enum 
{
  public static void main(String[] args) {
        // int i=5;
        // Status s = Status.Failed;
        // System.out.println(s);

        // System.out.println(s.ordinal());

        Status[] ss=Status.values();
        // System.out.println(ss);
        // System.out.println(ss[0]);

        for(Status s:ss){
            System.out.println(s + " : " + s.ordinal());
        }

  }   
}
