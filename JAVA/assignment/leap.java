import java.time.Year;
import java.util.*;

class leap{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter year = ");

        int years = sc.nextInt();
        if(years <=1000 ){
            System.out.println("Invalid number");
            return;
        }
        if(Year.isLeap(years)) {
            System.out.println("this is Leap Year");
        }
        else{
            System.out.println("Not a leap year");
        }
    }
}