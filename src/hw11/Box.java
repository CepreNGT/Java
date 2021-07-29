package hw11;

import java.util.ArrayList;

public class Box<T extends Fruit> {
    private ArrayList<T> contain = new ArrayList<>();

    public double getWeight(){
        double weight = 0.0;
        for (T fruit:contain) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public void add(T fruit){
        contain.add(fruit);
    }

    public boolean compare(Box<?> box){
        return Math.abs(this.getWeight() - box.getWeight()) < 0.0001;
    }

    public void move(Box<T> box){
        for (int i = contain.toArray().length - 1; i >= 0; i--) {
            box.add(contain.get(i));
            contain.remove(i);
        }
    }
}
