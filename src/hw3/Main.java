package hw3;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Random rand = new Random();
            int x = rand.nextInt(10);
            play(x);
            Scanner s = new Scanner(System.in);
            System.out.println("Повторить игру? 1 - да. 0 - нет.");
            int num = s.nextInt();
            if (num == 0) {
                break;
            }
        }
    }

    public static void play(int x) {
        System.out.println("Компьютер загадал число от 0 до 9 (включительно).");
        for (int i = 0; i < 3; i++) {
            Scanner s = new Scanner(System.in);
            System.out.println("Попыток осталось: " + (3 - i));
            System.out.println("\nВведите число: ");
            int num = s.nextInt();
            if (num == x) {
                System.out.println("Вы угадали!");
                break;
            } else if (num > x) {
                System.out.println("Вы не угадали. Ваше число больше загаданного.");
            } else {
                System.out.println("Вы не угадали. Ваше число меньше загаданного.");
            }
        }
        System.out.println("(Компьютер загадывал число " + x + ")\n");
    }
}