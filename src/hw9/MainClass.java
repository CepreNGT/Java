package hw9;

public class MainClass {
    public static void main(String[] args) {
        String[][] a = {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "8", "7", "6", "5" },
                { "4", "3", "2", "1" }
        };
        try {
            System.out.println("Сумма массива: " + sumArray(a));
        } catch (MyArraySizeException|MyArrayDataException e) {
            e.printStackTrace();
        }
        String[][] b = {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "8", "7", "6", "5" },
                { "4", "3", "2", "1" },
                { "0", "9", "5", "2" }
        };
        try {
            System.out.println("Сумма массива: " + sumArray(b));
        } catch (MyArraySizeException|MyArrayDataException e) {
            e.printStackTrace();
        }
        String[][] c = {
                { "1", "2", "3", "4" },
                { "5", "6", "7", "8" },
                { "8", "a", "6", "5" },
                { "4", "3", "2", "1" },
        };
        try {
            System.out.println("Сумма массива: " + sumArray(c));
        } catch (MyArraySizeException|MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    public static int sumArray (String[][] array) throws MyArraySizeException, MyArrayDataException{
        if (array.length != 4) {
            throw new MyArraySizeException("Размер массива некорректен.");
        }
        for (String[] elem:array) {
            if (elem.length != 4) {
                throw new MyArraySizeException("Размер массива некорректен.");
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Некорректные данные в ячейке (", i, j);
                }
            }
        }
        return sum;
    }
}
