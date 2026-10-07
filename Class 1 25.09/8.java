//8. Максимум последовательности. Пользователь вводит положительные целые числа. Ввод заканчивается числом 0. Найти максимальное из введенных чисел
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        int max=0;
        do {
            System.out.println("Введите положительное число: ");
            n = myScanner.nextInt();
            if (n>max) {
                max = n;
            } if (n==0) {
                break;
            } if (n<0) {
                System.out.println("ПОЛОЖИТЕЛЬНОЕ!"); continue;
            }
        } while (n>0);
        System.out.println(max);
    }
}