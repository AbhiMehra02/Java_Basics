class Switch
{
    public static void main(String a[])
    {
        String day ="Monday";

        // switch (day) {
        //     case "Satuday", "Sunday":
        //         System.out.println("6am");
        //         break;
        //     case "Monday": 
        //         System.out.println("8am");
        //         break;
        //     default:
        //         System.out.println("7am");
        //         break;
        // }

        // switch (day) {
        //     case "Satuday", "Sunday" -> System.out.println("6am");
        //     case "Monday"->System.out.println("8am");
        //     default -> System.out.println("7am");
        // }

        // String res="";
        // switch (day) {
        //     case "Satuday", "Sunday" -> res = "6am";
        //     case "Monday"-> res = "8am";
        //     default -> res = "7am";
        // }

        // System.out.println(res);

        
        // String res="";
        // res =switch (day) 
        // {
        //     case "Satuday", "Sunday" ->  "6am";
        //     case "Monday"-> "8am";
        //     default ->  "7am";
        // };

        // System.out.println(res);


        String res="";
        res =switch (day) 
        {
            case "Satuday", "Sunday" :yield "6am";
            case "Monday" :yield  "8am";
            default :yield  "7am";
        };

        System.out.println(res);

    }
}