package hw8;

public class Robot implements RunnableJumpable{
    private String name;
    private int runDistance;
    private int jumpHeight;

    public Robot(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    @Override
    public boolean run(int length) {
        if (length > runDistance) {
            System.out.printf("Робот %s не смог пробежать.\n", name);
            return false;
        } else {
            System.out.printf("Робот %s успешно пробежал.\n", name);
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if (height > jumpHeight) {
            System.out.printf("Робот %s не смог перепрыгнуть.\n", name);
            return false;
        } else {
            System.out.printf("Робот %s успешно перепрыгнул.\n", name);
            return true;
        }
    }
}
