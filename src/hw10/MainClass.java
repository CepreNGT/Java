package hw10;

import java.sql.SQLOutput;
import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        String[] words = {
                "Филипп", "Валерий", "Андрей", "Олеся",
                "Филипп", "Дмитрий", "Матвей", "Андрей",
                "Алексей", "Валерий", "Наталья", "Сергей",
                "Наталья", "Олеся", "Сергей", "Женя" };
        Set<String> uniqueWords = new HashSet<>(Arrays.asList(words));
        System.out.println("Изначальный массив: " + Arrays.toString(words));
        System.out.println();
        System.out.println("Уникальные слова: " + uniqueWords);
        System.out.println();
        Map<String, Integer> countWords = new HashMap<>();
        for (String word:words) {
            countWords.put(word, countWords.getOrDefault(word, 0) + 1);
        }
        System.out.println("Кол-во слов: " + countWords);
        System.out.println();
        System.out.println("2-е задание.");
        PhoneRB phoneBook = new PhoneRB();
        phoneBook.add("Андреев", "1111");
        phoneBook.add("Иванов", "2222");
        phoneBook.add("Андреев", "3333");
        phoneBook.add("Алексеев", "4444");
        phoneBook.add("Андреев", "5555");
        phoneBook.add("Андреев", "5555"); // Дважды один телефон.
        System.out.println("Номера телефона Андреева: " + phoneBook.get("Андреев"));
        System.out.println("Номера телефона Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Номера телефона Алексеева: " + phoneBook.get("Алексеев"));
    }
}
