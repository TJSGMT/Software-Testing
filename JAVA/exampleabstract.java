abstract class exampleabstract
{
   abstract void show(String s);

   void display(){
    System.out.println("in Display");
   }

   static void test(){
    System.out.println("in testing area");
   }

    exampleabstract() {
        System.out.println("in abstract method");
    }

    public static void main(String args[])
    {
        test();
        
    }

   class abs extends exampleabstract{
    
   }
    
}