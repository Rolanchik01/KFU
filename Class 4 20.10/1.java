import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int maxLen = 1;
        int maxStart = 0;
        int curLen = 1;
        int curStart = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                curLen++;
            } else {
                if (curLen > maxLen) {
                    maxLen = curLen;
                    maxStart = curStart;
                }
                curLen = 1;
                curStart = i;
            }
        }

        if (curLen > maxLen) {
            maxLen = curLen;
            maxStart = curStart;
        }

        System.out.println(maxStart + " " + maxLen);
    }
}
