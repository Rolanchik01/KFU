//6. Произведение нечетных чисел. Вводится положительное целое число n. Найти произведение всех нечетных чисел от 1 до n
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите положительное n: ");
            n = myScanner.nextInt();
        } while (n<=0);
        int res = 1;
        while (n>0) {
            int c = (n%10)%2;
            int pos = n%10;
            n = n/10;
            if (c!=0) {
                res *= pos;
            }
        }
        System.out.println(res);
    }
}