package cegepst.engine.Entity;

import cegepst.engine.controls.MovementController;

public abstract class ControllableEntity extends MovableEntity {

    private MovementController controller;

    public ControllableEntity(MovementController controller) {

        this.controller = controller;
    }

    public void moveAccordingToHandler() {
        if (!controller.isMoving()) {
            return;
        }
        if (controller.isUpPressed()) {
            moveTop();
        } else if (controller.isDownPressed()) {
            moveBottom();
        } else if (controller.isRightPressed()) {
            moveRight();
        } else if (controller.isLeftPressed()) {
            moveLeft();
        }
    }
}
