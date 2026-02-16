class grandparent
{
    int G = 70;
    void prod()
    {
        System.out.println("this is prod");
    }   
}
class parent extends grandparent{
   int p =50;
   void stage()
   {
      System.out.println("this is stage");
   }
}

class inhertiance{
    public static void main(String[] args)
    {
        parent t = new parent();
        t.prod();
        System.out.println("G = "+t.G);
        t.stage();
        System.out.println("p = "+t.p);
    }
}