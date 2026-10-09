//2. Вводится натурально n. Вычислить: 1**1 + 2**3 + 3**5 + ... + n**(2n-1)
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        System.out.println("Введите n: ");
        n = myScanner.nextInt();
        int res = 0;
        for (int i=1;i<=n;i+=1) {
            int power = 1;
            int exp = 2*i-1;
            for (int j=0;j<exp;j++) {
                power = power * i; //i=1 power=1; i=2 power=
            }
            res += power;
        }
        System.out.println(res);
    }
}