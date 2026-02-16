class task2

{
 int a=2;
 byte by= 2;
 short sh = 32333; 
 long l = 789845651332l;
 float f = 3.14f;
 double d = 33.99d;
 char c = 'T';
 boolean bb = true;
 String s = "Cognac";
 // int [] r = {1,2,3,6,4,7};

    
     public static void main(String args[]) 
     {

        int b=5;
        task2 obj = new task2();
        System.out.println("the Local value of a is ="+b);
        System.out.println("the Global value of a is ="+obj.by); 
        System.out.println("the Global value of a is ="+obj.sh); 
        System.out.println("the Global value of a is ="+obj.l); 
        System.out.println("the Global value of a is ="+obj.f); 
        System.out.println("the Global value of a is ="+obj.d); 
        System.out.println("the Global value of a is ="+obj.c); 
        System.out.println("the Local value of a is ="+obj.bb);  
        System.out.println("the Global value of a is ="+obj.s);
       // System.out.println("the Global value of a is ="+obj.r); 
  
        
    }
}