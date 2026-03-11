public class Pattern1 {
    public static void main(String[] args) {

        int[] rows = {10, 10, 10, 7, 3};

        for (int r : rows) {
            for (int i = 0; i < r; i++) {
                System.out.print("*");
            }
            System.out.println();
      }
    }
}
