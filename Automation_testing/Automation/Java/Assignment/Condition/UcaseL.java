
import java.util.Scanner;

class UcaseL{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char ch = s.charAt(0);
        if(ch >= 'A' && ch <='Z' ){
            System.out.println("Upper case character");
        }
        else 
        {
            System.out.println("Lower case character");
        }
    }
}