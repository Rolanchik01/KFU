import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
//        Pet pet = new Pet("Мурка", 70);

        String scannerName;
        System.out.println("Введите имя питомца: ");
        scannerName = myScanner.nextLine();

        int scannerEnergy;
        System.out.println("Введите его начальную энергию: ");
        scannerEnergy = myScanner.nextInt();

        Pet pet = new Pet(scannerName,scannerEnergy);

        System.out.println("          Питомец создан!");
        while (true) {
            System.out.println("1. Показать состояние\n" +
                    "2. Поиграть\n" +
                    "3. Отдохнуть\n" +
                    "4. Дать вкусняшку\n" +
                    "0. Выход\n");

            System.out.println("Выберете действие: ");
            int choice;
            choice = myScanner.nextInt();
            if (choice == 1) {
                System.out.println(pet.showStatus());
            } else if (choice == 2) {
                pet.play();
                System.out.println("Вы поиграли с " + scannerName);
            } else if (choice == 3) {
                pet.rest();
                System.out.println(scannerName + " " + "отдохнул(-а)!");
            } else if (choice == 4) {
                pet.giveTreat();
                System.out.println("Вы покормили " + scannerName + " !");
            } else if (choice == 0) {
                break;
            }
        }

//        pet.play();
//        pet.rest();
//        pet.giveTreat();

//        System.out.println(pet.showStatus());


    }
}

