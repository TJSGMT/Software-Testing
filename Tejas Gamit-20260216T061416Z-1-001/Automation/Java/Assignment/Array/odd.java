class odd{
    public static void main(String args[]){
         int[] number = {22,55,66,97,55};
        for (int i = 0; i < number.length; i++){
            if(number[i]%2 == 1){
                System.out.println(number[i]);
            }
        }
    }
}