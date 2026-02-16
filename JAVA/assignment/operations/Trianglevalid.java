import java.util.Scanner;

class Trianglevalid {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side a: ");
        int a = sc.nextInt();

        System.out.print("Enter side b: ");
        int b = sc.nextInt();

        System.out.print("Enter side c: ");
        int c = sc.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Triangle is valid");
        } else {
            System.out.println("Triangle is NOT valid");
        }
    }
}
