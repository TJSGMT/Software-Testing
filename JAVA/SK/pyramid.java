class pyramid{
    public static void main(String args[]){
        int n = 10;
        for (int i =0; i<n ;i++) /// outer
        {
            // for (int j = 0; j < 10; j++) {
            //     System.out.print("*");
            // }
            for(int j=1 ; j<=i ; j++)
            {
                System.out.print(i);
            }
            System.out.println(i);
        }
    }
}