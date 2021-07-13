package hw7;

public class Cat {
    private boolean satiety = false;
    private final String name;
    private final int saturation;

    public Cat(String name, int saturation) {
        this.name = name;
        this.saturation = saturation;
    }

    public void eat(Plate plate) {
        if (satiety) {
            System.out.printf("Кот %s уже сыт.\n", name);
        } else if (plate.decrease(saturation)){
            System.out.printf("Кот %s покушал.\n", name);
            plate.info();
            satiety = true;
        } else {
            System.out.printf("Кот %s не смог покушать:(\n", name);
        }
    }

    public void catInfo() {
        if (satiety) {
            System.out.printf("Кот %s сыт.\n", name);
        } else {
            System.out.printf("Кот %s голоден.\n", name);
        }
    }
}
