import java.util.*;

class calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int add = a+b;
        int div = a/b;
        int sub = a-b;
        int mul = a*b;
        int ans = sc.nextInt();
        switch(ans)
        {
            case 1: System.out.println("the Addition is ="+add);
                    break;    
            case 2: System.out.println("the Subtraction is ="+sub);
                    break;    
            case 3: System.out.println("the division is ="+div);
                    break;    
            case 4: System.out.println("the multiplication is ="+mul);
                    break;    
            default: System.out.println("Error!!!");            

        }

    }
}