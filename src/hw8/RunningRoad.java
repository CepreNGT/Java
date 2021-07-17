package hw8;

public class RunningRoad implements WallRoad {
    private int length;

    public RunningRoad(int length) {
        this.length = length;
    }

    public boolean go(RunnableJumpable participant){
        return participant.run(length);
    }
}
