package hw11;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        Integer[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(Arrays.toString(array));
        swap(array, 0, 8);
        System.out.println(Arrays.toString(array));
        swap(array, 4, 15);
        System.out.println("\nЗадание 2:");
        ArrayList<Object> newArray = toArrayList(array);
        System.out.println(newArray);
        System.out.println("\nЗадание 3:");
        Box<Apple> apples1 = new Box<>();
        Box<Apple> apples2 = new Box<>();
        Box<Orange> oranges = new Box<>();
        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Apple apple5 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        apples1.add(apple1);
        apples1.add(apple2);
        apples2.add(apple3);
        apples2.add(apple4);
        apples2.add(apple5);
        oranges.add(orange1);
        oranges.add(orange2);
        System.out.println("Вес первой коробки с яблоками: " + apples1.getWeight());
        System.out.println("Вес второй коробки с яблоками: " + apples2.getWeight());
        System.out.println("Вес коробки с апельсинами: " + oranges.getWeight());
        System.out.println("Вес первой коробки яблок равен весу коробки апельсинов: " + apples1.compare(oranges));
        System.out.println("Вес второй коробки яблок равен весу коробки апельсинов: " + apples2.compare(oranges));
        System.out.println("Вес второй коробки яблок равен весу первой: " + apples2.compare(apples1));
        apples1.move(apples2);
        System.out.println("Новый вес первой коробки яблок: " + apples1.getWeight());
        System.out.println("Новый вес второй коробки яблок: " + apples2.getWeight());
        System.out.println("Вес первой коробки яблок равен весу коробки апельсинов: " + apples1.compare(oranges));
        System.out.println("Вес второй коробки яблок равен весу коробки апельсинов: " + apples2.compare(oranges));
        System.out.println("Вес второй коробки яблок равен весу первой: " + apples2.compare(apples1));
    }

    public static void swap(Object[] array, int i, int j){
        try {
            Object second = array[j];
            array[j] = array[i];
            array[i] = second;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Задан некорректный индекс.");
        }
    }

    public static ArrayList<Object> toArrayList (Object[] array){
        return new ArrayList<>(Arrays.asList(array));
    }
}
