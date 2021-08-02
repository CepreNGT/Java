package hw12;

import java.util.Arrays;

public class MainClass {
    static final int SIZE = 10_000_000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        System.out.print("Время обработки массива в одном потоке: ");
        oneThread();
        System.out.print("Время обработки массива в двух потоках: ");
        twoThreads();
    }

    public static void oneThread(){
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + (float) i / 5) *
                    Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static void twoThreads(){
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        long startTime = System.currentTimeMillis();
        float[] arr1 = new float[HALF];
        float[] arr2 = new float[HALF];
        System.arraycopy(arr, 0, arr1, 0, HALF);
        System.arraycopy(arr, HALF, arr2, 0, HALF);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float) (arr[i] * Math.sin(0.2f + (float) i / 5) *
                    Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
            arr2[i] = (float) (arr[i] * Math.sin(0.2f + (float) i / 5) *
                    Math.cos(0.2f + (float) i / 5) * Math.cos(0.4f + (float) i / 2));
        }
        System.arraycopy(arr1, 0, arr, 0, HALF);
        System.arraycopy(arr2, 0, arr, HALF, HALF);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}
