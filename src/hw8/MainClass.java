package hw8;

public class MainClass {
    public static void main(String[] args) {
        Human h = new Human("Вася", 3000, 10);
        Cat c = new Cat("Барсик", 700, 1);
        Robot r = new Robot("Тесла", 10000, 30);
        Wall wall1 = new Wall(1);
        RunningRoad road1 = new RunningRoad(500);
        Wall wall2 = new Wall(15);
        RunningRoad road2 = new RunningRoad(3000);
        Wall wall3 = new Wall(30);
        RunningRoad road3 = new RunningRoad(10000);
        RunnableJumpable[] participants = {h, c, r};
        WallRoad[] difficulties = {wall1, road1, wall2, road2, wall3, road3};
        for (RunnableJumpable part:participants){
            System.out.println("Участник:");
            for (WallRoad diff:difficulties){
                if (!diff.go(part)){
                    break;
                }
            }
            System.out.println();
        }
    }
}
