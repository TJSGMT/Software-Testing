
import java.util.Scanner;

class alpha{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if( s.equals("a") || s.equals("e") || s.equals("i") || s.equals("o") || s.equals("u")  ){
            System.out.println("this is vowel");
        }
        else 
        {
            System.out.println("this is constant");
        }
    }
}