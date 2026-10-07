//9*(необязательно). Вводится положительное целое число. Определить, является ли оно палиндромом
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите положительное число: ");
            n = myScanner.nextInt();
        } while (n <= 0);
        int original = n;   // сохраняем исходное ДО изменений
        int reversed = 0;
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;  // сдвиг + цифра
            n = n / 10;
        }
        if (original == reversed) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Не палиндром");
        }
    }
}
