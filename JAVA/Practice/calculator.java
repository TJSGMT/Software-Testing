class addit{

    public int add(int n1, int n2)   //we need to make an vars to get those values from call method
    {
       int num1 = 45;
       int num2 = 55;
       int addition = num1 + num2 ;
       int add = n1-n2;
       System.out.println("inside add method");
       System.out.println("the value is = "+addition);
       System.out.println("the value is = "+add);
       return 0;
    }

}

public class calculator{
    public static void main(String[] args) {
     
        addit ad = new addit();  // this is how you make an object for calling
        ad.add(4,5);  // this is how you call method from another class    here to assign value thorugh calling method we need to add values in here first than
        // the 4 5 value will be only assigned to the variables created in the method's block
    }
}