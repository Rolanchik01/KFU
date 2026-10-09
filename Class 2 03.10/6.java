//6. Вводится нечетное натуральное число n. Вывести плюсик
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите нечетное n: ");
            n = myScanner.nextInt();
        } while (n%2==0);
        int mid = (n + 1) / 2;   // номер средней строки/столбца
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n;j++) {
                if (i == mid || j == mid) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}