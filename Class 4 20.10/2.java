import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int max1 = arr[0];
        int max2 = 0;
        boolean hasSecond = false;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max1) {
                max2 = max1;
                max1 = arr[i];
                hasSecond = true;
            } else if (arr[i] < max1) {
                if (!hasSecond || arr[i] > max2) {
                    max2 = arr[i];
                    hasSecond = true;
                }
            }
        }

        if (hasSecond) {
            System.out.println(max2);
        } else {
            System.out.println("NO");
        }
    }
}