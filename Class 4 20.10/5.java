import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] a = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int k = scanner.nextInt();
        int[][] b = new int[m][n - 1];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (j < k) {
                    b[i][j] = a[i][j];
                } else {
                    b[i][j] = a[i][j + 1];
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}