
import java.util.Scanner;

class typecaste{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter value of b = ");
        int b = sc.nextInt();

        boolean result = a>=b;   // here we've done type conversion
        System.out.println(result);

    }
}