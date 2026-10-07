//3. Вводится положительное целое число. Найти максимальную цифру в его записи
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите положительное число: ");
            n = myScanner.nextInt();
        } while (n<=0);
        int max=0;
        while (n>0) {
            int c = n%10;
            n = n/10;
            if (c>max) {
                max = c;
            }
        }
        System.out.println(max);
    }
}