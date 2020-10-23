package cegepst.engine.Entity;

import cegepst.InputHandler;

public abstract class ControllableEntity extends MovableEntity {

    private InputHandler inputHandler;

    public ControllableEntity(InputHandler inputHandler) {
        this.inputHandler = inputHandler;
    }

    public void moveAccordingToHandler() {
        if (!inputHandler.isMoving()) {
            return;
        }
        if (inputHandler.isTopPressed()) {
            moveTop();
        } else if (inputHandler.isBottomPressed()) {
            moveBottom();
        } else if (inputHandler.isRightPressed()) {
            moveRight();
        } else if (inputHandler.isLeftPressed()) {
            moveLeft();
        }
    }
}
