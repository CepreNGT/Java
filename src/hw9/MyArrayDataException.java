package hw9;

public class MyArrayDataException extends Exception{
    public MyArrayDataException(String message, int row, int col) {
        super(message + row + ", " + col + ")");
    }
}
