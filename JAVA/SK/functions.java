
import java.util.Scanner;   //in this program we've called functions with diff ways

class functions{

    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void addition(int sum){    /// calling addition function 1
        System.out.println(sum);
      //  return;
    }
    
    public static int add(int a,int b){    /// calling add function 2
        int som = a+b;
        return som;
    }

    public static void multiplication(int mul){ /// calling mul function 3
        System.out.println(mul);
        //return;
    }
 
    public static int multi(int a , int b){ /// calling mul function 4
        return a * b;
    }

    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        printMyName(name);
        int a = sc.nextInt();  // function 1
        int b = sc.nextInt();
        int sum = a+b;
        addition(sum);
        System.out.println("first way function call = "+sum);
        
        int som = add(a,b);    // function 2
        System.out.println("secod way fucntion call = "+som);


        int mul =  a*b;
        multiplication(mul);  // function 3
        System.out.println("multiplicatation ="+mul);

        System.out.println("multi "+multi(a, b));

    }
}