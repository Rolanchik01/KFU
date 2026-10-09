//5.  Вводится натуральное n. Вывести пирамиду
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        System.out.println("Введите n: ");
        n = myScanner.nextInt();
        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for (int j=1;j<=2*i-1;j+=1) {
                System.out.print("*");
            } System.out.println();
        }
    }
}