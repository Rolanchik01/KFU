////2. Вводится целое положительное число n. Вывести все четные числа от 1 до n
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите число: ");
//            n = myScanner.nextInt();
//        } while (n<=0);
//        for (int i=1;i<=n;i++) {
//            if (i%2==0) {
//                System.out.println(i);
//            }
//        }
//    }
//}

////3. Вводится целое положительное n. Найти сумму чисел от 1 до n
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int sum = 0;
//        int n;
//        do {
//            System.out.println("Введите число >0: ");
//            n = myScanner.nextInt();
//        } while (n<=0);
//        for (int i=1;i<=n;i++) {
//            if (i<=n) {
//                sum += i;
//            }
//        } System.out.println(sum);
//    }
//}

////4. Вводится целое число k. Вывести таблицу умножения для него от 1 × k до 10 × k
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int k;
//        do {
//            System.out.println("Введите k: ");
//            k = myScanner.nextInt();
//        } while (k<=0);
//        for (int i=1;i<=10;i++) {
//            System.out.println(i*k);
//        }
//    }
//}

////5. Вводится положительное целое число. Посчитать количество цифр в нем
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите положительное число: ");
//            n = myScanner.nextInt();
//        } while (n<=0);
//        int cnt = 0;
//        do {
//            n = n/10;
//            cnt++;
//        } while (n>0);
//        System.out.println(cnt);
//    }
//}

////6. Вводится положительное целое число. Найти сумму цифр введенного положительного целого числа
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите положительное число: ");
//            n = myScanner.nextInt();
//        } while (n<=0);
//        int sum = 0;
//        while (n>0) {
//            sum += n%10;
//            n = n/10;
//        }
//        System.out.println(sum);
//    }
//}

////7. Вводится положительное целое число. Получить число, записанное в обратном порядке (важно, что выводится прям число, не поэлементный вывод в консоль)
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите положительное число: ");
//            n = myScanner.nextInt();
//        } while (n<=0);
//        String c = "";
//        while (n>0) {
//            c += n%10;
//            n = n/10;
//        }
//        System.out.println(c);
//    }
//}

////8. Пользователь вводит целые числа. Ввод заканчивается, когда введен 0. Найти сумму всех введенных чисел, не считая ноль
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        int sum=0;
//        do {
//            System.out.println("Введите число: ");
//            n = myScanner.nextInt();
//            sum += n;
//        } while (n!=0); System.out.println(sum);
//    }
//}

////9. Пользователь вводит целые числа по одному. Ввод продолжается, пока каждое следующее число не меньше предыдущего. Как только введено число меньше предыдущего — завершить программу и вывести Последовательность нарушена.
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        int c=0;
//        do {
//            n = myScanner.nextInt();
//            System.out.println("Введите число: ");
//            c = n;
//        } while (n>=c);
//        System.out.println("Последовательность нарушена.");
//    }
//}

////10. Вводятся n целых чисел. Найти сумму только положительных чисел. Нули и отрицательные значения пропускать с помощью continue
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        int m;
//        int c=0;
//        int sum=0;
//        System.out.println("Введите количество чисел: ");
//        n = myScanner.nextInt();
//        do {
//            System.out.println("Введите число: ");
//            m = myScanner.nextInt();
//            c+=1;
//            sum += m;
//        } while (c<=n-1);
//    }
//}


//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        int m;
//        do {
//            System.out.println("Введите n: ");
//            n = myScanner.nextInt();
//            System.out.println("Введите m: ");
//            m = myScanner.nextInt();
//        } while (n<=0 && m<=0);
//        for (int i=1;i<=m;i++) {
//            for (int j=1;j<=n;j++) {
//                System.out.print("* ");
//                if (j==n) {
//                    System.out.println("");
//                }
//            }
//        }
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int m=9;
//        for (int i=1;i<=m;i++) {
//            for (int j=1;j<=m;j++) {
//                System.out.print(i*j+" ");
//            }
//            System.out.println("");
//        }
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        int sum = 0;
//        int power = 1;
//        do {
//            System.out.println("Введите натуральное число");
//            n = myScanner.nextInt();
//        } while (n<=0);
//        for (int i=1;i<=n;i++) {
//            power *= n;
//            sum += power;
//        }
//        System.out.println(sum);
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        int m=2;
//        do {
//            System.out.println("Введите натуральное число: ");
//            n = myScanner.nextInt();
//        } while (n<1);
//
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        int x;
//        n = myScanner.nextInt();
//        x = myScanner.nextInt();
//        int sum = 0;
//        int a=1;
//        for (int i=1;i<=n;i++) {
//            a *= x;
//            sum += a;
//        }
//        System.out.println(sum);
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        int x;
//        System.out.println("Введите n: ");
//        n = myScanner.nextInt();
//        System.out.println("Введите x: ");
//        x = myScanner.nextInt();
//        int sum=0;
//        int a=1;
//        int fact=1;
//        for (int k=1;k<=n;k++) {
//            fact *= k;
//            a *= x;
//            sum += a*fact;
//        }
//        System.out.println(sum);
//    }
//}

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите натуральное n: ");
//            n = myScanner.nextInt();
//        } while (n<1);
//        int a = 0;
//        int max = 0;
//        int res = 0;
//        for (int number=1;number<=n;number++) {
//            int temp = number;
//            int sum=0;
//            while (temp>0) {
//                int x = temp%10;
//                sum += x;
//                temp = temp/10;
//            } if (sum >= max) {
//                max = sum;
//                res = number;
//            }
//        }
//        System.out.println(res);
//        System.out.println(max);
//    }
//}

////1. Вводится положительное целое число n. Вывести все его положительные делители
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите положительное число n: ");
//            n = myScanner.nextInt();
//        } while (n<=0);
//        for (int i=1;i<=n;i++) {
//            if (n%i==0) {
//                System.out.println(i);
//            }
//        }
//    }
//}

////2. Вводится положительное целое число. Определить количество четных цифр в его записи
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите положительное число: ");
//            n = myScanner.nextInt();
//        } while (n<=0);
//        int c=0;
//        int nch=0;
//        while (n>0) {
//            nch = n%10;
//            n = n/10;
//            if (nch%2==0) {
//                c += 1;
//            }
//        }System.out.println(c);
//    }
//}

////3. Вводится положительное целое число. Найти максимальную цифру в его записи
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите положительное число: ");
//            n = myScanner.nextInt();
//        } while (n<=0);
//        int max=0;
//        while (n>0) {
//            int c = n%10;
//            n = n/10;
//            if (c>max) {
//                max = c;
//            }
//        }
//        System.out.println(max);
//    }
//}

////4. Вводятся целое число a и неотрицательное целое число n. Вычислить aⁿ
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int a; // не проверяем целостность а так как INT
//        int n;
//        do {
//            System.out.println("Введите неотрицательное n: ");
//            n = myScanner.nextInt();
//        } while (n<0);
//        int res=1;
//        System.out.println("Введите целое а: ");
//        a = myScanner.nextInt();
//        for (int i=1;i<=n;i++) {
//            res *= a;
//        }
//        System.out.println(res);
//    }
//}

////5. Вводятся положительное целое число n и цифра k от 0 до 9. Определить, сколько раз цифра k встречается в записи числа n
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите положительное n: ");
//            n = myScanner.nextInt();
//        } while (n<=0);
//        int k;
//        do {
//            System.out.println("Введите k ∈ [0;9]: ");
//            k = myScanner.nextInt();
//        } while (k>9||k<0);
//        int c=0;
//        while (n>0) {
//            if (n%10==k) {
//                c+=1;
//            } n = n/10;
//        }
//        System.out.println(c);
//    }
//}

////6. Произведение нечетных чисел. Вводится положительное целое число n. Найти произведение всех нечетных чисел от 1 до n
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите положительное n: ");
//            n = myScanner.nextInt();
//        } while (n<=0);
//        int res = 1;
//        while (n>0) {
//            int c = (n%10)%2;
//            int pos = n%10;
//            n = n/10;
//            if (c!=0) {
//                res *= pos;
//            }
//        }
//        System.out.println(res);
//    }
//}

////7. Пользователь вводит целые числа до тех пор, пока не введет 0. Вывести количество положительных и отрицательных введенных чисел. Ноль не учитывать
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int c=0;
//        int n;
//        do {
//            System.out.println("Введите число: ");
//            n = myScanner.nextInt();
//            c+=1;
//        } while (n!=0);
//        System.out.println(c-1);
//    }
//}

////8. Максимум последовательности. Пользователь вводит положительные целые числа. Ввод заканчивается числом 0. Найти максимальное из введенных чисел
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        int max=0;
//        do {
//            System.out.println("Введите положительное число: ");
//            n = myScanner.nextInt();
//            if (n>max) {
//                max = n;
//            } if (n==0) {
//                break;
//            } if (n<0) {
//                System.out.println("ПОЛОЖИТЕЛЬНОЕ!"); continue;
//            }
//        } while (n>0);
//        System.out.println(max);
//    }
//}

////9*(необязательно). Вводится положительное целое число. Определить, является ли оно палиндромом
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите положительное число: ");
//            n = myScanner.nextInt();
//        } while (n <= 0);
//        int original = n;   // сохраняем исходное ДО изменений
//        int reversed = 0;
//        while (n > 0) {
//            int digit = n % 10;
//            reversed = reversed * 10 + digit;  // сдвиг + цифра
//            n = n / 10;
//        }
//        if (original == reversed) {
//            System.out.println("Палиндром");
//        } else {
//            System.out.println("Не палиндром");
//        }
//    }
//}

////1. Вводится натуральное n. Вычислить: 1**2 + 2**2 + 3**2 + ... + n**2
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        System.out.println("Введите n: ");
//        n = myScanner.nextInt();
//        int res = 0;
//        for (int i=1;i<=n;i++) {
//            res += i*i;
//        }
//        System.out.println(res);
//    }
//}

////2. Вводится натурально n. Вычислить: 1**1 + 2**3 + 3**5 + ... + n**(2n-1)
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        System.out.println("Введите n: ");
//        n = myScanner.nextInt();
//        int res = 0;
//        for (int i=1;i<=n;i+=1) {
//            int power = 1;
//            int exp = 2*i-1;
//            for (int j=0;j<exp;j++) {
//                power = power * i; //i=1 power=1; i=2 power=
//            }
//            res += power;
//        }
//        System.out.println(res);
//    }
//}

////3
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        System.out.println("Введите n: ");
//        n = myScanner.nextInt();
//        int count = 0; //количество цифр
//        int res=0;
//        int origin = n;
//        while (n>0) {
//            count += 1;
//            n = n/10; //посчитали количество цифр, нужно возвести каждую цифру в эту степень
//        }
//        n = origin;
//        while (n>0) {
//            int digit = n%10; // работаем с этой цифрой(эту цифру должны умножить на себя count раз)
//            n = n/10;
//            int power = 1;
//            for (int i=0;i<count;i++) {
//                power = power * digit;
//            } res += power;
//        } if (res==origin) {
//            System.out.println("Да");
//        } else {
//            System.out.println("Нет");
//        }
//    }
//}

////4. Вводится натуральное n. Вывести треугольник
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        System.out.println("Введите n: ");
//        n = myScanner.nextInt();
//        for (int i=1;i<=n;i++) {
//            for (int j=1;j<=i;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

////5.  Вводится натуральное n. Вывести пирамиду
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        System.out.println("Введите n: ");
//        n = myScanner.nextInt();
//        for (int i=1;i<=n;i++) {
//            for (int j=1;j<=n-i;j++) {
//                System.out.print(" ");
//            }
//            for (int j=1;j<=2*i-1;j+=1) {
//                System.out.print("*");
//            } System.out.println();
//        }
//    }
//}

////6. Вводится нечетное натуральное число n. Вывести плюсик
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        do {
//            System.out.println("Введите нечетное n: ");
//            n = myScanner.nextInt();
//        } while (n%2==0);
//        int mid = (n + 1) / 2;   // номер средней строки/столбца
//        for (int i=1;i<=n;i++) {
//            for (int j=1;j<=n;j++) {
//                if (i == mid || j == mid) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}

////7. Вводится натуральное n. Вывести крестик
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        int n;
//        System.out.print("Введите n: ");
//        n = myScanner.nextInt();
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                if (i == j || i + j == n + 1) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//}


//09.10 - CLASS
//public static void main(String[] args) {
//    int[] array = fillArray();
//    int[] answer = getMaxValue(array);
//    System.out.println(answer[0]);
//    System.out.println(answer[1]);
//}
//
//public static int[] fillArray(){
//    Scanner myScanner = new Scanner(System.in);
//    int n;
//    do {
//        n = myScanner.nextInt();
//    } while (n < 1);
//    int[] array = new int[n];
//    for (int i = 0; i < n; i++){
//        array[i] = myScanner.nextInt();
//    }
//    return array;
//}
//
//public static int[] getMaxValue(int[] array){
//    int maxValue = array[0];
//    int maxIndex = 0;
//    for (int i = 1; i < array.length; i++){
//        if (maxValue < array[i]){
//            maxValue = array[i];
//            maxIndex = i;
//        }
//    }
//    int[] answer = {maxValue, maxIndex};
//    return answer;
//}

////1. Вводится натуральное число n, затем n целых чисел. Создать массив, найти максимальный элемент и индекс его первого вхождения
//public static void main(String[] args) {
//    int[] array = fillArray();
//    int[] answer = getMaxValue(array);
//    System.out.println(answer[0]);
//    System.out.println(answer[1]);
//}
//
//public static int[] fillArray() {
//    Scanner myScanner = new Scanner(System.in);
//    int n;
//    do {
//        System.out.println("Введите натуральное n: ");
//        n = myScanner.nextInt();
//    } while (n<1);
//    int[] array = new int[n];
//    for (int i=0;i<n;i++) {
//        array[i] = myScanner.nextInt();
//    } return array;
//}
//
//public static int[] getMaxValue(int[] array) {
//    int maxValue = array[0];
//    int maxIndex = 0;
//    for (int i=1;i<array.length;i++) {
//        if (array[i] > maxValue) {
//            maxValue = array[i];
//            maxIndex = i;
//        }
//    } int[] answer = {maxValue,maxIndex};
//    return answer;
//}

////2. Вводится массив из n целых чисел. Определить, содержит ли он не менее двух отрицательных чисел
//public static void main(String[] args) {
//    int[] array = fillArray();
//    boolean result = twoNegatives(array);
//    System.out.println(result);
//}
//
//public static int[] fillArray() {
//    Scanner myScanner = new Scanner(System.in);
//    int n;
//    do {
//        System.out.println("Введите n>0: ");
//        n = myScanner.nextInt();
//    } while (n<1);
//    int[] array = new int[n];
//    for (int i=0;i<n;i++) {
//        array[i] = myScanner.nextInt();
//    } return array;
//}
//
//public static boolean twoNegatives(int[] array) {
//    int count = 0;
//    for (int i=0;i<array.length;i++) {
//        if (array[i] < 0) {
//            count += 1;
//        }
//    } return count>=2;
//}

////3. Вводится натуральное n, затем два массива из n целых чисел. Определить, равны ли массивы поэлементно
//public static void main(String[] args) {
//    Scanner myScanner = new Scanner(System.in);
//    int n;
//    do {
//        System.out.println("Введите n>0: ");
//        n = myScanner.nextInt();
//    } while (n<1);
//    int[] array1 = readArray(myScanner,n);
//    int[] array2 = readArray(myScanner, n);
//    //функция сравнения
//    System.out.println(sravn(array1,array2));
//}
//public static int[] readArray(Scanner myScanner, int n) {
//    int[] array = new int[n];
//    for (int i = 0; i < n; i++) {
//        array[i] = myScanner.nextInt();
//    }
//    return array;
//}
//
//public static boolean sravn(int[] a, int[] b) {
//    for (int i=0;i<a.length;i++) {
//        if (a[i]!=b[i]) {
//            return false;
//        }
//    } return true;
//}

////4. Вводится массив из n целых чисел. Создать его копию, затем заменить все отрицательные числа в копии на нули. Вывести исходный и измененный массивы
//public static void main(String[] args) {
//    int[] original = fillArray();
//    int[] copy = copyArray(original);
//    replaceNegatives(copy);
//    System.out.println(Arrays.toString(original));
//    System.out.println(Arrays.toString(copy));
//}
//
//public static int[] fillArray() {
//    Scanner myScanner = new Scanner(System.in);
//    int n;
//    do {
//        System.out.println("Введите n>0: ");
//        n = myScanner.nextInt();
//    } while (n<1);
//
//    int[] array = new int[n];
//    for (int i=0;i<n;i++) {
//        array[i] = myScanner.nextInt();
//    } return array;
//}
//
//public static int[] copyArray(int[] array) {
//    int[] b = new int[array.length];
//    for (int i=0;i<array.length;i++) {
//        b[i] = array[i];
//    } return b;
//}
//
//public static void replaceNegatives(int[] array) {
//    for (int i=0;i<array.length;i++) {
//        if (array[i] < 0) {
//            array[i] = 0;
//        }
//    }
//}

////5. Вводится массив из n целых чисел. Сдвинуть все элементы на одну позицию вправо. Последний элемент должен стать первым (без создания дополнительного массива)
//public static void main(String[] args) {
//    int[] array = fillArray();
//    changeArray(array);
//    System.out.println(Arrays.toString(array));
//}
//
//public static int[] fillArray() {
//    Scanner myScanner = new Scanner(System.in);
//    int n;
//    do {
//        System.out.println("Введите n>0: ");
//        n = myScanner.nextInt();
//    } while (n<1);
//    int[] array = new int[n];
//    for (int i=0;i<n;i++) {
//        array[i] = myScanner.nextInt();
//    } return array;
//}
//
//public static int[] changeArray(int[] array) {
//    int last = array[array.length-1];
//    for (int j=array.length-1;j>0;j--) {
//        array[j] = array[j-1];
//    } array[0] = last;
//    return array;
//}

////6. Вводятся натуральные m, n, затем матрица размером m × n. Вывести сумму элементов каждой строки и каждого столбца
//public static void main(String[] args) {
//    int[][] matrix = fillArray();
//    int m = matrix.length;
//    int n = matrix[0].length;
//
//    int[] rows = rowSums(matrix);
//    int[] cols = colSums(matrix);
//
//    for (int i = 0; i < m; i++) {
//        System.out.println("Сумма строки " + (i + 1) + ": " + rows[i]);
//    }
//    for (int j = 0; j < n; j++) {
//        System.out.println("Сумма столбца " + (j + 1) + ": " + cols[j]);
//    }
//}
//
//public static int[][] fillArray() {
//    Scanner myScanner = new Scanner(System.in);
//    int m, n;
//    do {
//        System.out.println("Введите m>0: ");
//        m = myScanner.nextInt();
//        System.out.println("Введите n>0: ");
//        n = myScanner.nextInt();
//    } while (m < 1 || n < 1);
//
//    int[][] array = new int[m][n];
//    for (int i = 0; i < m; i++) {
//        for (int j = 0; j < n; j++) {
//            array[i][j] = myScanner.nextInt();
//        }
//    }
//    return array;
//}
//
//public static int[] rowSums(int[][] a) {
//    int m = a.length;
//    int n = a[0].length;
//    int[] sums = new int[m];
//    for (int i = 0; i < m; i++) {
//        int s = 0;
//        for (int j = 0; j < n; j++) {
//            s += a[i][j];
//        }
//        sums[i] = s;
//    }
//    return sums;
//}
//
//public static int[] colSums(int[][] a) {
//    int m = a.length;
//    int n = a[0].length;
//    int[] sums = new int[n];
//    for (int j = 0; j < n; j++) {
//        int s = 0;
//        for (int i = 0; i < m; i++) {
//            s += a[i][j];
//        }
//        sums[j] = s;
//    }
//    return sums;
//}

////7. Вводится матрица размером m × n. Найти максимальный элемент каждой строки и каждого столбца
//public static void main(String[] args) {
//    int[][] matrix = fillArray();
//    int m = matrix.length;
//    int n = matrix[0].length;
//    for (int i=0;i<m;i++) {
//        System.out.println("Макс в строке" + (i+1) + ": " + findMax(matrix[i]));
//    }
//    for (int j=0;j<n;j++) {
//        System.out.println("Макс в столбце" + (j+1) + ": " + findMax(matrix[j]));
//    }
//}
//
//public static int[][] fillArray() {
//    Scanner myScanner = new Scanner(System.in);
//    int m,n;
//    do {
//        System.out.println("Введите m>0: ");
//        m = myScanner.nextInt();
//        System.out.println("Введите n>0: ");
//        n = myScanner.nextInt();
//    } while (m<1 || n<1);
//    int[][] array = new int[m][n];
//    for (int i=0;i<m;i++) {
//        for (int j=0;j<n;j++) {
//            array[i][j] = myScanner.nextInt();
//        }
//    } return array;
//}
//
//public static int findMax(int[] array) {
//    int max = array[0];
//    for (int i=0;i<array.length;i++) {
//        if (array[i]>max) {
//            max = array[i];
//        }
//    } return max;
//}
//
//public static int colMax(int[][] a, int j) {
//    int max = a[0][j];
//    for (int i = 1; i < a.length; i++) {
//        if (a[i][j] > max) {
//            max = a[i][j];
//        }
//    }
//    return max;
//}

//1
//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner myScanner = new Scanner(System.in);
//        System.out.println("Введите натуральное n: ");
//        int n = myScanner.nextInt();
//        System.out.println("Введите вещественное x: ");
//        double x = myScanner.nextDouble();
//        double sum = 0.0;
//        for (int k=1;k<=n;k++) {
//            double numerator = power(x,3*k-1);
//            double denominator = factorial(2*k)+k;
//            sum += numerator/denominator;
//        }
//        System.out.println(sum);
//    }
//    // ФУНКЦИЯ ВОЗВЕДЕНИЯ В СТЕПЕНЬ
//    // base - основание, exp - степень
//    public static double power(double base, int exp) {
//        double result = 1.0;
//        for (int i=0;i<exp;i++) {
//            result = result * base;
//        } return result;
//    }
//    // ФУНКЦИЯ ФАКТОРИАЛА
//    // num - число, до которого считаем факториал(перемножаем все числа до него)
//    public static double factorial(int num) {
//        double result = 1.0;
//        for (int i=1;i<=num;i++) {
//            result = result * i;
//        } return result;
//    }
//}


public static class Main {

}

public class Book {

}



























