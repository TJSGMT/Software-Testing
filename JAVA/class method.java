class method
{
   void over()
   {
    System.out.println("no arguments");  
   }

   void over(int a)
   {
    System.out.println("with arguments = "+a);
   }

   public static void main(String args[])
   {
    method m = new method();
    m.over();
    m.over(77);
   }
}