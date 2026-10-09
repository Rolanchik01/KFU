//3
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        System.out.println("Введите n: ");
        n = myScanner.nextInt();
        int count = 0; //количество цифр
        int res=0;
        int origin = n;
        while (n>0) {
            count += 1;
            n = n/10; //посчитали количество цифр, нужно возвести каждую цифру в эту степень
        }
        n = origin;
        while (n>0) {
            int digit = n%10; // работаем с этой цифрой(эту цифру должны умножить на себя count раз)
            n = n/10;
            int power = 1;
            for (int i=0;i<count;i++) {
                power = power * digit;
            } res += power;
        } if (res==origin) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}