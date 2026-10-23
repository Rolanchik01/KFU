//5. Вводится массив из n целых чисел. Сдвинуть все элементы на одну позицию вправо. Последний элемент должен стать первым (без создания дополнительного массива)
public static void main(String[] args) {
    int[] array = fillArray();
    changeArray(array);
    System.out.println(Arrays.toString(array));
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

public static int[] changeArray(int[] array) {
    int last = array[array.length-1];
    for (int j=array.length-1;j>0;j--) {
        array[j] = array[j-1];
    } array[0] = last;
    return array;
}