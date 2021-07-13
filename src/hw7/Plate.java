package hw7;

public class Plate {
    private final int size;
    private int amountOfFood;

    public Plate(int size) {
        this.size = size;
        amountOfFood = size;
    }

    public void addFood(int num) {
        if (num + amountOfFood > size && num > 0) {
            System.out.println("В тарелке не хватает места.");
        } else if (num > 0) {
            amountOfFood += num;
        } else {
            System.out.println("Вы не смогли добавить еду.");
        }
        info();
    }

    public void info(){
        System.out.printf("Тарелка: %d/%d\n", amountOfFood, size);
    }

    public boolean decrease(int saturation) {
        if (amountOfFood - saturation >= 0 && saturation > 0) {
            amountOfFood -= saturation;
            return true;
        }
        return false;
    }
}
