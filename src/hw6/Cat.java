package hw6;

public class Cat extends Animal {
    private static int count = 0;
    private String name;
    private final int runningLength = 200;

    public Cat(String name){
        super(name);
        this.name = name;
        count++;
    }

    void run(int length) {
        if (length > runningLength) {
            System.out.println("Кот " + name + " пробежал " + runningLength + " м. и больше не смог.");
        } else if (length > 0) {
            System.out.println("Кот " + name + " пробежал " + length + " м.");
        } else {
            System.out.println("Кот " + name + " нисколько не пробежал.");
        }
    }

    void swim(int length) {
        System.out.println("Кот " + name + " не умеет плавать:(");
    }

    void catCount(){
        System.out.printf("Котов было создано %d.\n", count);
    }
}
