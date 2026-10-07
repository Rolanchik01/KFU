//4. Вводятся целое число a и неотрицательное целое число n. Вычислить aⁿ
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int a; // не проверяем целостность а так как INT
        int n;
        do {
            System.out.println("Введите неотрицательное n: ");
            n = myScanner.nextInt();
        } while (n<0);
        int res=1;
        System.out.println("Введите целое а: ");
        a = myScanner.nextInt();
        for (int i=1;i<=n;i++) {
            res *= a;
        }
        System.out.println(res);
    }
}