class over
{
    void loading()
    {
        System.out.println("no argument");
    }

    void loading(int a)
    {
        System.out.println("with argument" +a);
    }

    class methodoverloding
    {
        public static void main(String args[])
        {
            over o = new over();
            o.loading();
            o.loading(77);     
        }
    }
}