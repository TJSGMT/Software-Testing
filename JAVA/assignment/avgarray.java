class avgarray{
    public static void main(String args[])
    {
        int[] number = {22,55,66,97,55};
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum = sum+number[i];
        }    
        int average = sum / number.length;
        System.out.println("average = "+average);
        System.out.println("sum = "+sum);
    }
}