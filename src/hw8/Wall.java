package hw8;

public class Wall implements WallRoad {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean go(RunnableJumpable participant){
        return participant.jump(height);
    }
}
