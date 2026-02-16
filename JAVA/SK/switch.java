import java.util.*;

class Switch
{
    public static void main(String args[])
    {
            Scanner sc = new Scanner(System.in);
            int Button = sc.nextInt();
            switch(Button){
                case 1 : System.out.println("Im the only one");
                        break;
                case 2 : System.out.println("You and Me it's two");
                        break;
                case 3 : System.out.println("teen tikda kam bigda");
                        break;
                case 4 : System.out.println("fantastic four");
                        break;
                case 5 : System.out.println("Hight five");
                        break;
                default: System.out.println("your out of range");      
            
            }
    }
}