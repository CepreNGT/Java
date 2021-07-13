package hw6;

public class Animal {
    private static int count = 0;
    private String name;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    void run(int length) {
        System.out.println("Животное " + name + " пробежало " + length + " м.");
    }

    void swim(int length) {
        System.out.println("Животное " + name + " проплыло " + length + " м.");
    }

    void animalCount(){
        System.out.printf("Животных было создано %d.\n", count);
    }
}