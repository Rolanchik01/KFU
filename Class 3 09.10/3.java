
//3. Вводится натуральное n, затем два массива из n целых чисел. Определить, равны ли массивы поэлементно
public static void main(String[] args) {
    Scanner myScanner = new Scanner(System.in);
    int n;
    do {
        System.out.println("Введите n>0: ");
        n = myScanner.nextInt();
    } while (n<1);
    int[] array1 = readArray(myScanner,n);
    int[] array2 = readArray(myScanner, n);
    //функция сравнения
    System.out.println(sravn(array1,array2));
}
public static int[] readArray(Scanner myScanner, int n) {
    int[] array = new int[n];
    for (int i = 0; i < n; i++) {
        array[i] = myScanner.nextInt();
    }
    return array;
}

public static boolean sravn(int[] a, int[] b) {
    for (int i=0;i<a.length;i++) {
        if (a[i]!=b[i]) {
            return false;
        }
    } return true;
}