package cegepst.engine.Entity;

public enum Direction {
    LEFT(-1, 0),
    RIGHT(1, 0),
    TOP(0, -1),
    BOTTOM(0, 1);


    private final int xMultiplier;
    private final int yMultiplier;

    Direction(int xMultiplier, int yMultiplier) {
        this.xMultiplier = xMultiplier;
        this.yMultiplier = yMultiplier;
    }

    public int velocityX(int speed) {
        return xMultiplier * speed;
    }

    public int velocityY(int speed) {
        return yMultiplier * speed;
    }
}
