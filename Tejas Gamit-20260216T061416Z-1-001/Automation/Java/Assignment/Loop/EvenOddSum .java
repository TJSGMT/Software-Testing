class EvenOddSum {
    public static void main(String[] args) {

        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= 50; i++) {
            System.out.print(i + " ");

            if (i % 2 == 0)
                evenSum += i;
            else
                oddSum += i;
        }

        System.out.println("\nSum of even numbers = " + evenSum);
        System.out.println("Sum of odd numbers = " + oddSum);
    }
}
