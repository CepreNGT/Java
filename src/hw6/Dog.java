package hw6;

public class Dog extends Animal{
    private static int count = 0;
    private String name;
    private final int runningLength = 500;
    private final int swimmingLength = 10;

    public Dog(String name){
        super(name);
        this.name = name;
        count++;
    }

    void run(int length) {
        if (length > runningLength) {
            System.out.println("Собака " + name + " пробежала " + runningLength + " м. и больше не смогла.");
        } else if (length > 0) {
            System.out.println("Собака " + name + " пробежала " + length + " м.");
        } else {
            System.out.println("Собака " + name + " нисколько не пробежала.");
        }
    }

    void swim(int length) {
        if (length > swimmingLength) {
            System.out.println("Собака " + name + " проплыла " + swimmingLength + " м. и больше не смогла.");
        } else if (length > 0) {
            System.out.println("Собака " + name + " проплыла " + length + " м.");
        } else {
            System.out.println("Собака " + name + " нисколько не проплыла.");
        }
    }

    void dogCount(){
        System.out.printf("Собак было создано %d.\n", count);
    }
}
