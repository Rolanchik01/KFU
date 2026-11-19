import java.util.Scanner;

public class BingX {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // --- СОЗДАНИЕ ПЕРВОГО ИГРОКА ---
        System.out.println("Введите имя 1-го владельца: ");
        String name1 = myScanner.nextLine();
        System.out.println("Введите его начальный баланс: ");
        double balance1 = myScanner.nextDouble();
        myScanner.nextLine(); // Очищаем буфер после nextDouble()
        CryptoWallet wallet1 = new CryptoWallet(name1, balance1);

        // --- СОЗДАНИЕ ВТОРОГО ИГРОКА ---
        System.out.println("Введите имя 2-го владельца: ");
        String name2 = myScanner.nextLine();
        System.out.println("Введите его начальный баланс: ");
        double balance2 = myScanner.nextDouble();
        myScanner.nextLine(); // Очищаем буфер
        CryptoWallet wallet2 = new CryptoWallet(name2, balance2);

        // --- ВЫБОР АКТИВНОГО КОШЕЛЬКА ---
        System.out.println("\nЗа кого будем играть?");
        System.out.println("1. " + wallet1.getOwner());
        System.out.println("2. " + wallet2.getOwner());
        int select = myScanner.nextInt();

        CryptoWallet activeWallet;
        CryptoWallet otherWallet;

        if (select == 2) {
            activeWallet = wallet2;
            otherWallet = wallet1;
        } else {
            activeWallet = wallet1;
            otherWallet = wallet2;
        }

        System.out.println("\nВы играете за: " + activeWallet.getOwner());

        // --- ОСНОВНОЕ МЕНЮ ---
        while (true) {
            System.out.println("\n" +
                    "========== ROLAN CRYPTO ==========\n" +
                    "Активный кошелек: " + activeWallet.getOwner() + "\n" +
                    "Баланс: " + activeWallet.getUsdBalance() + "$\n" +
                    "BTC price: $" + activeWallet.getBtcPrice() + "\n" +
                    "\n" +
                    "1. Показать баланс\n" +
                    "2. Купить BTC\n" +
                    "3. Продать BTC\n" +
                    "4. Перевести доллары игроку " + otherWallet.getOwner() + "\n" +
                    "5. Перевести BTC игроку " + otherWallet.getOwner() + "\n" +
                    "6. Сменить кошелек\n" +
                    "0. Выход\n" +
                    "\n" +
                    "Выберите действие:\n");

            int choice = myScanner.nextInt();

            if (choice == 1) {
                System.out.println(activeWallet.showStatus());
            }
            else if (choice == 2) {
                System.out.println("Кол-во BTC на покупку: ");
                double amount = myScanner.nextDouble();
                double fee = amount * activeWallet.getBtcPrice() * activeWallet.getFeeRate();
                if (activeWallet.buyBTC(amount)) {
                    System.out.println("Успешно куплено " + amount + " BTC!\nКомиссия: " + fee + "$");
                } else {
                    System.out.println("Ошибка: недостаточно средств или неверное количество");
                }
            }
            else if (choice == 3) {
                System.out.println("Кол-во BTC на продажу: ");
                double amount = myScanner.nextDouble();
                double fee = amount * activeWallet.getBtcPrice() * activeWallet.getFeeRate();
                if (activeWallet.sellBtc(amount)) {
                    System.out.println("Успешно продано " + amount + " BTC!\nКомиссия: " + fee + "$");
                } else {
                    System.out.println("Ошибка: недостаточно BTC или неверное количество.");
                }
            }
            else if (choice == 4) {
                System.out.println("Сколько долларов перевести игроку " + otherWallet.getOwner() + "?");
                double amount = myScanner.nextDouble();

                if (activeWallet.transferUsd(otherWallet, amount)) {
                    System.out.println("Перевод успешен! Вы отправили " + amount + "$ игроку " + otherWallet.getOwner());
                } else {
                    System.out.println("Ошибка: недостаточно средств или неверная сумма.");
                }
            }
            else if (choice == 5) {
                System.out.println("Сколько BTC перевести игроку " + otherWallet.getOwner() + "?");
                double amount = myScanner.nextDouble();

                if (activeWallet.transferBtc(otherWallet, amount)) {
                    System.out.println("Перевод успешен! Вы отправили " + amount + " BTC игроку " + otherWallet.getOwner());
                } else {
                    System.out.println("Ошибка: недостаточно BTC или неверная сумма.");
                }
            }
            else if (choice == 6) {
                CryptoWallet temp = activeWallet;
                activeWallet = otherWallet;
                otherWallet = temp;
                System.out.println("Вы переключились на кошелек: " + activeWallet.getOwner());
            }
            else if (choice == 0) {
                System.out.println("До встречи!");
                break;
            }
            else {
                System.out.println("Введена неизвестная команда, попробуйте снова");
            }
        }
    }
}