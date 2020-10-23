package cegepst;

import cegepst.engine.Buffer;
import cegepst.engine.Game;

import java.awt.*;
import java.util.ArrayList;

public class MovingRectangleGame extends Game {

    private Player player;
    private InputHandler inputHandler;
    private ArrayList<FootPrint> footPrints;

    public MovingRectangleGame() {
        inputHandler = new InputHandler();
        player = new Player (inputHandler);

        footPrints = new ArrayList<>();
        super.addKeyListener(inputHandler);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void conclude() {
    }

    @Override
    public void update() {
        if (inputHandler.isQuitPressed()) {
            super.stop();
        }
        player.update();
        if (inputHandler.isMoving()) {
            footPrints.add(player.layFootprint());
        }
    }

    @Override
    public void draw(Buffer buffer) {
        for (FootPrint footPrint : footPrints) {
            footPrint.draw(buffer);
        }
        player.draw(buffer);
    }
}
