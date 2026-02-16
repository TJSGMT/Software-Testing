class Arrae{
    public static void main(String[] args) {
        
        int num[] = {5,7,3,9};
        int nums[] = new int[4];
        num[3] = 77;  // change the value of array
        System.out.println(num[3]);
        nums[0] = 11;
        nums[1] = 41;
        nums[2] = 16;
        nums[3] = 95;
        System.out.println(nums[0]);
        for (int i = 0; i < 4; i++) {
         System.out.println(num[i]);   
        }
        System.out.println("done!!!!");
    }
}