//1. Вводится натуральное число n, затем n целых чисел. Создать массив, найти максимальный элемент и индекс его первого вхождения
public static void main(String[] args) {
    int[] array = fillArray();
    int[] answer = getMaxValue(array);
    System.out.println(answer[0]);
    System.out.println(answer[1]);
}

public static int[] fillArray() {
    Scanner myScanner = new Scanner(System.in);
    int n;
    do {
        System.out.println("Введите натуральное n: ");
        n = myScanner.nextInt();
    } while (n<1);
    int[] array = new int[n];
    for (int i=0;i<n;i++) {
        array[i] = myScanner.nextInt();
    } return array;
}

public static int[] getMaxValue(int[] array) {
    int maxValue = array[0];
    int maxIndex = 0;
    for (int i=1;i<array.length;i++) {
        if (array[i] > maxValue) {
            maxValue = array[i];
            maxIndex = i;
        }
    } int[] answer = {maxValue,maxIndex};
    return answer;
}