public class SeriesSum {
    public static void main(String[] args) {

        double sum = 0.0;

        for (int i = 1; i <= 50; i++) {
            sum = sum + (1.0 / i);
        }

        System.out.println("Sum of series = " + sum);
    }
}

