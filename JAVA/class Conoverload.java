

class Conoverload
{
    Conoverload(){
        System.out.println("Calling Default Constructor");
    }
    Conoverload(int a)
    {
        System.out.println("Calling costructor "+a);
    }

    void testing()
    {
        Conoverload c1 = new Conoverload(10);
        System.out.println("\nTest calling");
    }
    public static void main(String args[])
    {
        Conoverload obj1 = new Conoverload();
        Conoverload obj2 = new Conoverload(20);
        System.out.println("\ncalling out main method");
        obj1.testing();
    }
}