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

        int maxSum = -2000000000;
        int maxRow = 0;
        int maxCol = 0;

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                int sum = a[i][j] + a[i][j+1] + a[i+1][j] + a[i+1][j+1];

                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        System.out.println("Сумма: " + maxSum);
        System.out.println("Строка: " + maxRow);
        System.out.println("Столбец: " + maxCol);
    }
}