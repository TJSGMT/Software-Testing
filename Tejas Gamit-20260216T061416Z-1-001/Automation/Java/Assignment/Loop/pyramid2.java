public class pyramid2 {
    public static void main(String[] args) {
        
        int totalRows = 5;

        for (int i = 1; i <= totalRows; i++) {

            for (int s = 1; s <= totalRows - i; s++) {
                System.out.print(" ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
