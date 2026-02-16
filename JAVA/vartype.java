class vartype
{
    int a = 20;
    static int b=35;

    void show()
        {
            System.out.println("value of a "+a);
            System.out.println("value of b "+b);
            vartype v1 = new vartype();
            v1.a=b;
            v1.b=95;
            System.out.println("value of vl.a"+v1.a);
            System.out.println("value of vi.b "+v1.b);
            System.out.println("value of updated a "+a);
            System.out.println("value of updated b "+b);

        }
           public static void main(String args[]) 
        {
            vartype v1 = new vartype();
        }
}