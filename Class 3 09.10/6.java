//6. Вводятся натуральные m, n, затем матрица размером m × n. Вывести сумму элементов каждой строки и каждого столбца
public static void main(String[] args) {
    int[][] matrix = fillArray();
    int m = matrix.length;
    int n = matrix[0].length;

    int[] rows = rowSums(matrix);
    int[] cols = colSums(matrix);

    for (int i = 0; i < m; i++) {
        System.out.println("Сумма строки " + (i + 1) + ": " + rows[i]);
    }
    for (int j = 0; j < n; j++) {
        System.out.println("Сумма столбца " + (j + 1) + ": " + cols[j]);
    }
}

public static int[][] fillArray() {
    Scanner myScanner = new Scanner(System.in);
    int m, n;
    do {
        System.out.println("Введите m>0: ");
        m = myScanner.nextInt();
        System.out.println("Введите n>0: ");
        n = myScanner.nextInt();
    } while (m < 1 || n < 1);

    int[][] array = new int[m][n];
    for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            array[i][j] = myScanner.nextInt();
        }
    }
    return array;
}

public static int[] rowSums(int[][] a) {
    int m = a.length;
    int n = a[0].length;
    int[] sums = new int[m];
    for (int i = 0; i < m; i++) {
        int s = 0;
        for (int j = 0; j < n; j++) {
            s += a[i][j];
        }
        sums[i] = s;
    }
    return sums;
}

public static int[] colSums(int[][] a) {
    int m = a.length;
    int n = a[0].length;
    int[] sums = new int[n];
    for (int j = 0; j < n; j++) {
        int s = 0;
        for (int i = 0; i < m; i++) {
            s += a[i][j];
        }
        sums[j] = s;
    }
    return sums;
}