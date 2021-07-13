package hw6;

public class MainApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Dog dog = new Dog("Бобик");
        Animal animal = new Animal("Дональд");
        cat1.run(500);
        cat1.swim(500);
        cat2.run(115);
        cat2.swim(500);
        dog.run(493);
        dog.swim(7);
        dog.swim(15);
        animal.swim(1023);
        animal.run(2239);
        System.out.println();
        cat1.catCount();
        cat2.catCount();
        dog.dogCount();
        animal.animalCount();
    }
}
