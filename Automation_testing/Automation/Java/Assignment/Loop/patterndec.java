class patterndec{
    public static void main(String args[])
    {
        int n = 6;
        for (int i = 1; i < n; i++) // outer loop 
        {    
            for (int j =1 ; j <=n-i ; j++)  // inner loop
            {  
                System.out.print(" ");
            }

            for (int j =1 ; j <=i ; j++)  // inner loop
            {  
                System.out.print("*");
            }
            System.out.println();
        }    
    }
}