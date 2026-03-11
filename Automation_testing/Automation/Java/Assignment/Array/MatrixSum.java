import java.util.Scanner;

class MatrixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] arr = new int[3][3];

        System.out.println("Enter 9 numbers for 3x3 matrix:");

        // input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Row sums
        System.out.println("\nSum of Rows:");
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Row " + (i+1) + " = " + rowSum);
        }

        // Column sums
        System.out.println("\nSum of Columns:");
        for (int j = 0; j < 3; j++) {
            int colSum = 0;
            for (int i = 0; i < 3; i++) {
                colSum += arr[i][j];
            }
            System.out.println("Column " + (j+1) + " = " + colSum);
        }

        // Diagonal sums
        int mainDiagonal = 0;
        int secondaryDiagonal = 0;

        for (int i = 0; i < 3; i++) {
            mainDiagonal += arr[i][i];          // (0,0), (1,1), (2,2)
            secondaryDiagonal += arr[i][2 - i]; // (0,2), (1,1), (2,0)
        }

        System.out.println("\nMain Diagonal Sum = " + mainDiagonal);
        System.out.println("Secondary Diagonal Sum = " + secondaryDiagonal);
    }
}
