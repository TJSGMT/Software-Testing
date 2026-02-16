interface p1{
    void show();
}
interface p2{
    void display();
}
class Child implements p1 ,p2{
    public void show(){
        System.out.println("Show method of p1");
    }

    public void display()
    {
        System.out.println("Display method of p2");
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.show();
        c.display();
        
    }
}