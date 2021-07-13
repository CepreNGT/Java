package hw4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char[][] map;
    public static final int SIZE = 3;
    public static final int DOTS_TO_WIN = 3;
    public static final int maxSteps = SIZE * SIZE;

    public static final char STEP_O = 'O';
    public static final char STEP_X = 'X';
    public static final char EMPTY_SPACE = '•';

    public static final Scanner sc = new Scanner(System.in);
    public static final Random r = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        int steps = 0;
        while (true) {
            if (steps != maxSteps) {
                userStep();
                printMap();
                steps += 1;
                if (wins(STEP_X)) {
                    System.out.println("Вы победили!!!");
                    break;
                }
            } else {
                System.out.println("Ничья!!!");
                break;
            }
            if (steps != maxSteps) {
                aiStep();
                System.out.println("Компьютер сходил.");
                printMap();
                steps += 1;
                if (wins(STEP_O)) {
                    System.out.println("Компьютер победил!!!");
                    break;
                }
            } else {
                System.out.println("Ничья!!!");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = EMPTY_SPACE;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void userStep() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = STEP_X;
    }

    public static boolean isCellValid(int x, int y){
        return (x < SIZE && y < SIZE && x >= 0 && y >= 0 && map[y][x] == EMPTY_SPACE);
    }

    public static void aiStep() {
        boolean step = false;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j) && !step) {
                    map[j][i] = STEP_O;
                    if (wins(STEP_O)) {
                        step = true;
                        break;
                    }
                    map[j][i] = EMPTY_SPACE;
                }
            }
        }
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (isCellValid(i, j) && !step) {
                    map[j][i] = STEP_X;
                    if (wins(STEP_X)) {
                        map[j][i] = STEP_O;
                        step = true;
                        break;
                    }
                    map[j][i] = EMPTY_SPACE;
                }
            }
        }
        if (!step && SIZE == 3) {
            if (isCellValid(1, 1)) {
                map[1][1] = STEP_O;
                step = true;
            }
        }
        if (!step) {
            int x, y;
            do {
                x = r.nextInt(SIZE);
                y = r.nextInt(SIZE);
            } while (!isCellValid(x, y));
            map[y][x] = STEP_O;
        }
    }

    public static boolean wins(char player) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (cellWins(i, j, player)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean cellWins(int x, int y, char player) {
        if (isCellInMap(x + DOTS_TO_WIN - 1, y)) {
            int num = 0;
            for (int k = 0; k < DOTS_TO_WIN; k++) {
                if (map[x + k][y] != player){
                    break;
                }
                num++;
            }
            if (num == DOTS_TO_WIN) {
                return true;
            }
        }
        if (isCellInMap(x + DOTS_TO_WIN - 1, y + DOTS_TO_WIN - 1)) {
            int num = 0;
            for (int k = 0; k < DOTS_TO_WIN; k++) {
                if (map[x + k][y + k] != player){
                    break;
                }
                num++;
            }
            if (num == DOTS_TO_WIN) {
                return true;
            }
        }
        if(isCellInMap(x + DOTS_TO_WIN - 1, y - DOTS_TO_WIN + 1)) {
            int num = 0;
            for (int k = 0; k < DOTS_TO_WIN; k++) {
                if (map[x + k][y - k] != player){
                    break;
                }
                num++;
            }
            if (num == DOTS_TO_WIN) {
                return true;
            }
        }
        if (isCellInMap(x, y + DOTS_TO_WIN - 1)) {
            int num = 0;
            for (int k = 0; k < DOTS_TO_WIN; k++) {
                if (map[x][y + k] != player) {
                    break;
                }
                num++;
            }
            if (num == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    public static boolean isCellInMap(int x, int y) {
        return (x >= 0 && y >= 0 && x < SIZE && y < SIZE);
    }
}