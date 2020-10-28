package cegepst;

import cegepst.engine.Buffer;
import cegepst.engine.Game;
import java.util.ArrayList;

public class MovingRectangleGame extends Game {

    private Player player;
    private GameController controller;
    private ArrayList<FootPrint> footPrints;

    public MovingRectangleGame() {
        controller = new GameController();
        player = new Player (controller);

        footPrints = new ArrayList<>();
        super.addKeyListener(controller);
    }

    @Override
    public void initialize() {

    }

    @Override
    public void conclude() {
    }

    @Override
    public void update() {
        if (controller.isQuitPressed()) {
            super.stop();
        }
        player.update();
        if (controller.isMoving()) {
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
