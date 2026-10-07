//5. Вводятся положительное целое число n и цифра k от 0 до 9. Определить, сколько раз цифра k встречается в записи числа n
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите положительное n: ");
            n = myScanner.nextInt();
        } while (n<=0);
        int k;
        do {
            System.out.println("Введите k ∈ [0;9]: ");
            k = myScanner.nextInt();
        } while (k>9||k<0);
        int c=0;
        while (n>0) {
            if (n%10==k) {
                c+=1;
            } n = n/10;
        }
        System.out.println(c);
    }
}