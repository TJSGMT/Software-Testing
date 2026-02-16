import java.util.Scanner;

class evnodd {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println("this is even");
        } else {
            System.out.println("this is odd");
        }
    }
}
