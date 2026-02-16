class mcalculator{


    int add(int a, int b){
       System.out.println("same name");
        return a-b;
    }
    int add(int a, int b,int c){
       System.out.println("diff params");
        return a-b+c;
    }

}

class calkoolator{
    public static void main(String[] args) {
        
        mcalculator obj = new mcalculator();
        int resultt = obj.add(78, 11);
        int result = obj.add(78, 10,25);
        System.out.println("the results is = "+result);
        System.out.println("the results is = "+resultt);
    }
}