import java.util.Scanner;

class wrapperclass{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter value of a = ");
        int a = sc.nextInt();
        Integer obj = a;
        System.out.println("the value of an object is = "+obj);
        System.out.print ("enter value of an object = ");
        Integer obj1 = sc.nextInt();
        int b = obj1;
        System.out.println("the value of b = "+b);
    }
}