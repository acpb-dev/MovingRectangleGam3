package cegepst;

import cegepst.engine.Buffer;
import cegepst.engine.Entity.StaticEntity;

import java.awt.*;
import java.util.Random;

public class FootPrint extends StaticEntity {

    private int width = 3;
    private int height = 3;

    public FootPrint(int x, int y) {
        setDimension(5, 5);
        teleport(x, y);
    }
    @Override
    public void draw(Buffer buffer) {
        Color color = new Color(getRandomValue(),getRandomValue(),getRandomValue());
        buffer.drawRectangle(x, y, width, height, color);
    }

    private int getRandomValue() {
        return (new Random().nextInt(256));
    }
}
