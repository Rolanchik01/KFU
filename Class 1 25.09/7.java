//7. Пользователь вводит целые числа до тех пор, пока не введет 0. Вывести количество положительных и отрицательных введенных чисел. Ноль не учитывать
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int c=0;
        int n;
        do {
            System.out.println("Введите число: ");
            n = myScanner.nextInt();
            c+=1;
        } while (n!=0);
        System.out.println(c-1);
    }
}