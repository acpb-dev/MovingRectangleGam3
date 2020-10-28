package cegepst;

import cegepst.engine.Buffer;
import cegepst.engine.Entity.ControllableEntity;
import cegepst.engine.controls.Controller;
import cegepst.engine.controls.MovementController;

import java.awt.*;

public class Player extends ControllableEntity {

    public Player(MovementController controller) {
        super(controller);
        super.setDimension(30, 30);
        super.teleport(100, 100);
        super.setSpeed(4);
    }

    public FootPrint layFootprint() {
        return new FootPrint(x, y);
    }
    @Override
    public void draw(Buffer buffer) {
        buffer.drawRectangle(x, y, width, height, Color.RED);
    }

    @Override
    public void update() {
        moveAccordingToHandler();
    }
}
