class swap
{
    public static void main (String args[])
    {
        int a =10;
        int b =20;

        System.out.println("value of a =" + a +",b="+b);
        a = a+b;
        b = a-b;
        a = a-b;


        System.out.println("after swap value of a =" + a +",b="+b);
    }

}




// Done //