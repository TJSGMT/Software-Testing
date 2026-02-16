
import java.util.Scanner;

class uncheckedexception{
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter values of a and b = ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            System.out.println(a/b*2-1);
          
            try {
                String s = null;
                System.out.println(s.length()); 
                
            } catch (NullPointerException e) {
                System.out.println("caught an unchecked exception"+e);
            }
            finally{
                System.out.println("in tothe finally block");
            }
            System.out.println("continue----");
        }
}