//4. Вводится массив из n целых чисел. Создать его копию, затем заменить все отрицательные числа в копии на нули. Вывести исходный и измененный массивы
public static void main(String[] args) {
    int[] original = fillArray();
    int[] copy = copyArray(original);
    replaceNegatives(copy);
    System.out.println(Arrays.toString(original));
    System.out.println(Arrays.toString(copy));
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

public static int[] copyArray(int[] array) {
    int[] b = new int[array.length];
    for (int i=0;i<array.length;i++) {
        b[i] = array[i];
    } return b;
}

public static void replaceNegatives(int[] array) {
    for (int i=0;i<array.length;i++) {
        if (array[i] < 0) {
            array[i] = 0;
        }
    }
}