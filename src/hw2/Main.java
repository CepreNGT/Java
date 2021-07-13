package hw2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        int[] arr1 = { 1, 0, 0, 1, 1, 1, 0, 0, 1, 0 };
        task1(arr1);
        System.out.println();
        System.out.println("Задание 2:");
        int[] arr2 = new int[8];
        task2(arr2);
        System.out.println();
        System.out.println("Задание 3:");
        int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        task3(arr3);
        System.out.println();
        System.out.println("Задание 4:");
        int[][] arr4 = new int[5][5];
        task4(arr4);
        System.out.println();
        System.out.println("Задание 5:");
        int[] arr5 = { 10, 8, 4, 24, 18, 16 };
        task5(arr5);
        System.out.println();
        System.out.println("Задание 6:");
        System.out.println("Можно ли разделить массив на две равные по сумме части?");
        int[] arr6 = { 2, 3, 4, 5, 6, 7, 7, 7, 13 };
        System.out.println(task6(arr6));
        int[] arr7 = { 2, 3, 4, 5, 6, 7, 7, 7, 30 };
        System.out.println(task6(arr7));
        System.out.println();
        System.out.println("Задание 7:");
        System.out.println("После: " + Arrays.toString(task7(arr7, 4)));
        int[] arr8 = { 4, 76, 33, 7, 378, 29, 48, 32 };
        System.out.println("После: " + Arrays.toString(task7(arr8, -2)));
        int[] arr9 = { 4, 76, 33, 7, 378, 29, 48, 32 };
        System.out.println("Или не сдвигаем вовсе:");
        System.out.println("До: " + Arrays.toString(arr9));
        System.out.println("После: " + Arrays.toString(task7(arr9, 0)));
    }

    public static void task1 (int[] arr) {
        System.out.println("Меняем местами 1 и 0.");
        System.out.println("До: " + Arrays.toString(arr) + ";");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println("После: " + Arrays.toString(arr) + ".");
    }

    public static void task2 (int[] arr) {
        System.out.println("Заполним массив числами 0, 3, 6...");
        System.out.println("До: " + Arrays.toString(arr) + ";");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
        }
        System.out.println("После: " + Arrays.toString(arr) + ".");
    }

    public static void task3 (int[] arr) {
        System.out.println("Числа, меньшие 6, умножим на 2.");
        System.out.println("До: " + Arrays.toString(arr) + ";");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println("После: " + Arrays.toString(arr) + ".");
    }

    public static void task4 (int[][] arr) {
        System.out.println("Диагональные элементы - 1.");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j || i + j == arr.length - 1) {
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void task5 (int[] arr) {
        System.out.println("Найдём минимальное и максимальное числа в массиве.");
        System.out.println("Массив: " + Arrays.toString(arr) + ";");
        int min = arr[0], max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальный элемент: " + min + "; Максимальный элемент: " + max + ".");
    }

    public static boolean task6 (int[] arr) {
        System.out.println("Массив: " + Arrays.toString(arr) + ";");
        int b = arr.length - 1, a = 0;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sum1 > sum2) {
                sum2 += arr[b];
                b -= 1;
            } else {
                sum1 += arr[a];
                a += 1;
            }
        }
        if (arr.length == 1) {
            return false;
        }
        return (sum1 == sum2);
    }

    public static int[] task7 (int[] arr, int n) {
        n = n % arr.length;
        if (n > 0) {
            System.out.println("Сдвигаем элементы массива на " + n + " вправо.");
            System.out.println("До: " + Arrays.toString(arr) + ";");
            for (int i = 0; i < n; i++) {
                int k = arr[0], l;
                arr[0] = arr[arr.length - 1];
                for (int j = 1; j < arr.length; j++) {
                    l = arr[j];
                    arr[j] = k;
                    k = l;
                }
            }
        } else if (n < 0) {
            System.out.println("Сдвигаем элементы массива на " + -n + " влево.");
            System.out.println("До: " + Arrays.toString(arr) + ";");
            for (int i = 0; i < -n; i++) {
                int k = arr[arr.length - 1], l;
                arr[arr.length - 1] = arr[0];
                for (int j = 1; j < arr.length; j++) {
                    l = arr[arr.length - 1 - j];
                    arr[arr.length - 1 - j] = k;
                    k = l;
                }
            }
        }
        return arr;
    }
}