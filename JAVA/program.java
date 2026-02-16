class program
{
    public static void main (String args[])
    {
        int a =10;
        int b =20;

        System.out.println("value of a =" + a +",b="+b);
        int tmp = a;
        a=b;
        b = tmp;
        System.out.println("after swap value of a =" + a +",b="+b);
    }

}