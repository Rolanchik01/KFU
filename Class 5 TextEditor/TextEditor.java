//import java.util.Scanner;
//public class TextEditor {
//    public static void main(String[] args) {
//        System.out.println("========== TEXT EDITOR ==========\n" +
//                "\n" +
//                "Текущий текст: Hello Java!\n" +
//                "\n" +
//                "1. Подсчитать количество гласных\n" +
//                "2. Проверить количество гласных\n" +
//                "3. Проверить палиндром\n" +
//                "4. Подсчитать количество слов\n" +
//                "5. Найти подстроку\n" +
//                "6. Заменить подстроку\n" +
//                "0. Выход\n" +
//                "\n" +
//                "Выберите действие:\n");
//        Scanner myScanner = new Scanner(System.in);
//        int command;
//        while (true) {
//            System.out.println("Выберете действие: ");
//            command = myScanner.nextInt();
//            if (command == 1) {
//                // методПодсчитать количество гласных
//            } else if (command == 2) {
//                // Проверить количество гласных
//            } else if (command == 3) {
//                // Проверить палиндром
//            } else if (command == 4) {
//                //Подсчитать количество слов
//            } else if (command == 5) {
//                //Найти подстроку
//            } else if (command == 6) {
//                //Заменить подстроку
//            } else if (command == 0) {
//                //Выход
//                System.out.println("Пока!");
//                break;
//            } else {
//                System.out.println("Неверный номер команды!");
//            }
//        }
//    }
//    public static int countVowels(String text) {
//        int count=0;
//        char[] array = {'a','e','i','o','u','A','E','I','O','U'};
//        for (int i=0;i<text.length();i++) {
//            for (int j=0;j<array.length;j++) {
//                if (text.charAt(i) == array[j]) {
//                    count += 1;
//                    break;
//                }
//            } return count;
//        }
//    }
//    public static boolean hasOnlyVowels(String text) {
//        if (countVowels(text) == text.length()) {
//            return true;
//        } return false;
//    }
//    public static boolean hasExactlyThreeVowels(String text) {
//        if (countVowels(text) == 3) {
//            return true;
//        } return false;
//    }
//    public static boolean isPalindrome(String text) {
//        int count = 0;
//        for (int i=0;i<text.length();i++) {
//            if (text.charAt(i) == text.charAt(text.length()-1-i)) {
//                count += 1;
//            }
//        }
//        if (count == text.length()) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//
//    public static int countWords(String text) {
//        char[] chars = text.toCharArray();
//        boolean hasSymlb = false;
//        boolean hasSpace = false;
//        int count = 0;
//        for (char i : chars) {
//            if (i == ' ') {
//                if (! hasSpace) {
//                    hasSpace = true;
//                    if (hasSymlb) {
//                        count++;
//                        hasSymlb = false;
//                    }
//                } else {
//                    hasSymlb = true;
//                    hasSpace = false;
//                }
//            } return count;
//        }
//    }
//    public static int findSubstring(String text, String pattern) {
//        Scanner myScanner = new Scanner(System.in);
//        do {
//            System.out.println("Введите подстроку: ");
//            pattern = myScanner.nextLine();
//        } while (pattern.isEmpty()); // цикл повторяется, ПОКА строка пустая
//        int index = text.indexOf(pattern);
//        return index;
//    }
//    public static String replaceSubstring(String text, String oldPart, String newPart) {
//        //разбиваем строку на 3 части и далее используем StringBuilder
//        //строка до + измененное + после
//    }
//
//}
