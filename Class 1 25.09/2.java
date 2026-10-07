//2. Вводится положительное целое число. Определить количество четных цифр в его записи
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите положительное число: ");
            n = myScanner.nextInt();
        } while (n<=0);
        int c=0;
        int nch=0;
        while (n>0) {
            nch = n%10;
            n = n/10;
            if (nch%2==0) {
                c += 1;
            }
        }System.out.println(c);
    }
}