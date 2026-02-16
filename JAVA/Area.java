
import java.util.Scanner;

class Area
{
    int length;
    int width;

    void setdim(int l,int w)
    {
        length = l;
        width = w;
    }

    int getArea()
    {
        return length * width;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("the value of length is = ");
        int l = sc.nextInt();
        System.out.print("the value of width is = ");
        int w = sc.nextInt();

        Area recta = new Area();
        recta.setdim(l, w);

        int area = recta.getArea();
        System.out.println("Area of rectangle = "+area); 
            
    }
}