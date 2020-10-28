package cegepst.engine.Entity;

import cegepst.engine.controls.Direction;

public abstract class MovableEntity extends  UpdateTableEntity {


    private Direction direction = Direction.TOP;
    private int speed = 1;

    public void moveLeft() {
        move(Direction.LEFT);
    }

    public void moveRight() {
        move(Direction.RIGHT);
    }

    public void moveTop() {
        move(Direction.TOP);
    }

    public void moveBottom() {
        move(Direction.BOTTOM);
    }

    public void move(Direction direction) {
        this.direction = direction;
        x += direction.velocityX(speed);
        y += direction.velocityY(speed);
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
