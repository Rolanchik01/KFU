//2. Вводится массив из n целых чисел. Определить, содержит ли он не менее двух отрицательных чисел
public static void main(String[] args) {
    int[] array = fillArray();
    boolean result = twoNegatives(array);
    System.out.println(result);
}

public static int[] fillArray() {
    Scanner myScanner = new Scanner(System.in);
    int n;
    do {
        System.out.println("Введите n>0: ");
        n = myScanner.nextInt();
    } while (n<1);
    int[] array = new int[n];
    for (int i=0;i<n;i++) {
        array[i] = myScanner.nextInt();
    } return array;
}

public static boolean twoNegatives(int[] array) {
    int count = 0;
    for (int i=0;i<array.length;i++) {
        if (array[i] < 0) {
            count += 1;
        }
    } return count>=2;
}