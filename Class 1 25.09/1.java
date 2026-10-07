10import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        int n;
        do {
            System.out.println("Введите положительное число n: ");
            n = myScanner.nextInt();
        } while (n<=0);
        for (int i=1;i<=n;i++) {
            if (n%i==0) {
                System.out.println(i);
            }
        }
    }
}