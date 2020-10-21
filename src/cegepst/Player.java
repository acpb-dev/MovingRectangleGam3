package cegepst;

import cegepst.engine.Buffer;

import java.awt.*;

public class Player {

    private int x;
    private int y;
    private int width = 30;
    private int height = 60;
    private int speed = 4;

    public Player(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw(Buffer buffer) {
        buffer.drawRectangle(x, y, width, height, Color.RED);
    }

    public void update(InputHandler inputHandler) {
        if (inputHandler.isBottomPressed()) {
            y += speed;
        } else if (inputHandler.isTopPressed()) {
            y -= speed;
        } else if (inputHandler.isLeftPressed()) {
            x -= speed;
        } else if (inputHandler.isRightPressed()) {
            x += speed;
        }
    }
}
