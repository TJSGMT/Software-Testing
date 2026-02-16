class AreaOfShape{
    

    void area(double r){
        double circle = 3.14 * r*r;
        System.out.println("the area of circle is = " +circle);
    }   

    void area(int a){
        int square = a*a;
        System.out.println("The area of square is = "+square);
    }
    
    public static void main(String[] args) {
        AreaOfShape ar = new AreaOfShape();
        ar.area(7.5);
        ar.area(7);
    }
}