//4. Вводится натуральное n. Вывести треугольник
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        System.out.println("Введите n: ");
        n = myScanner.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}