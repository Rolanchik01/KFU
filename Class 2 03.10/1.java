//1. Вводится натуральное n. Вычислить: 1**2 + 2**2 + 3**2 + ... + n**2
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        System.out.println("Введите n: ");
        n = myScanner.nextInt();
        int res = 0;
        for (int i=1;i<=n;i++) {
            res += i*i;
        }
        System.out.println(res);
    }
}