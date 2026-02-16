
import java.util.Scanner;

class Updated_Switch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        String result = "";
        //switch (day) ///  1 2
        result= switch (day) //returning value 3
        {
            // case "monday","tuesday" -> System.out.println("Wake me Up at 6:30 AM");   //1
            // case "Saturday","Sunday" -> System.out.println("Wake me Up at 7:00 AM");    //1  
           
            // case "monday","tuesday" -> result = "6:30 Am";         // returnning result instead sop  2
            // case "Saturday","Sunday" -> result = "7:00 AM";    
           
            case "monday","tuesday" -> "6:30 Am";         // returnning result instead sop with returning value 3
             case "Saturday","Sunday" -> "7:00 AM";    
           
            default ->"Sleep Well";
        };
            System.out.println(result);
    }
}