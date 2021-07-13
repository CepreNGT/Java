package hw1;

public class Main {
    public static void main(String[] args) {
        byte byteNumber = 100;
        short shortNumber = 10000;
        int intNumber = 1000000000;
        long longNumber = 1000000000000000000L;
        float floatNumber = 20.3842f;
        double doubleNumber = 20.3842;
        char charType = '\uabcd';
        boolean bool = true;
        System.out.println(task3(2.5f, 4.5f, 7.2f, 8.9f));
        System.out.println(task4(9, 3));
        System.out.println(task4(4, 3));
        task5(10);
        task5(-10);
        task5(0);
        System.out.println(task6(10));
        System.out.println(task6(-10));
        System.out.println(task6(0));
        task7("Валерий");
        task8(4);
        task8(100);
        task8(400);
        task8(2020);
        task8(2021);
    }

    public static float task3 (float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    public static boolean task4 (int num1, int num2) {
        int summ = num1 + num2;
        return (summ < 21 && summ > 9);
    }

    public static void task5 (int num) {
        if (num >= 0) {
            System.out.println("Число " + num + " положительное.");
        } else {
            System.out.println("Число " + num + " отрицательное.");
        }
    }

    public static boolean task6 (int num) {
        return (num < 0);
    }

    public static void task7 (String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void task8 (int num) {
        if (num % 4 == 0) {
            if (num % 100 == 0) {
                if (num % 400 == 0) {
                    System.out.println(num + " год високосный.");
                } else {
                    System.out.println(num + " год не високосный.");
                }
            } else {
                System.out.println(num + " год високосный.");
            }
        } else {
            System.out.println(num + " год не високосный.");
        }
    }
}