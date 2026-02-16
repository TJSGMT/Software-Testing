class ifelseifelse{
    public static void main(String[] args) {
        int a = 78;
        int b = 25;
        int c = 66;

        // if (a>b && a>c) {
        //     System.out.println("A is greater");
            
        // } else if(b>a && b>c){
        //     System.out.println("B is greater");
        // }
        // else{
        //     System.out.println("c is greater");
        // }
        if (a>b || a>c) {
            System.out.println("A is greater");
            
        } else if(b>a || b>c){
            System.out.println("B is greater");
        }
        else{
            System.out.println("c is greater");
        }
    }
}