class Bike{

    void Engine(){
        System.out.println("Inside the engine method");
    }

    String seats(int a){

        if(a <= 10)
            System.out.println("value of integer is "+a);
        else
            System.out.println("Wrong number");

        System.out.println(a);
        return "leather";
    }
}

class methods{
    public static void main(String[] args) {

        Bike obj = new Bike();
        obj.Engine();
        String sr=obj.seats(20);
        System.out.println("seats are made of "+sr);
        
    }   
}