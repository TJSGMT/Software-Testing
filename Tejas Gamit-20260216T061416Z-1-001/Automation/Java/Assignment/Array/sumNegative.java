class sumNegative{
    public static void main(String args[])
    {
        int[] number = {22,55,-66,-97,55};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            if(number[i] < 0){
                System.out.println(number[i]);
                sum = sum+number[i];
            }
        }    
       System.out.println("sum of negative numbers= "+sum);
    }
}