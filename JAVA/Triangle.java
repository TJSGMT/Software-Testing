class Triangle
{
    int a,b,c;

    public Triangle(int a,int b,int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int perimeter()
    {
        return a * b *c;

    }

    int area()
    {
        int h = (a*c)/b;
        int area= (b*h) / 2;
        return area;
    }

    public static void main(String[] args) 
    {
        Triangle tr = new Triangle(3, 4, 5);
        System.out.println("perimeter ="+tr.perimeter());
        System.out.println("Area = "+tr.area());
        
    }    
}