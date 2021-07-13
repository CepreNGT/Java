package hw7;

public class MainClass {
    public static void main(String[] args) {
        Cat[] cats = new Cat[10];
        cats[0] = new Cat("Барсик", 5);
        cats[1] = new Cat("Мурзик", 10);
        cats[2] = new Cat("Мурка", 15);
        cats[3] = new Cat("Кеша", 20);
        cats[4] = new Cat("Стеша", 30);
        cats[5] = new Cat("Рич", 50);
        cats[6] = new Cat("Добби", 100);
        cats[7] = new Cat("Батон", 120);
        cats[8] = new Cat("Шрек", 80);
        cats[9] = new Cat("Хлеб", 40);
        Plate plate = new Plate(300);
        for (Cat cat:cats) {
            cat.eat(plate);
        }
        System.out.println();
        plate.addFood(200);
        plate.addFood(1000);
        for (Cat cat:cats) {
            cat.catInfo();
        }
    }
}
