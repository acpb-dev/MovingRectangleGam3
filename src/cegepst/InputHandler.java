package cegepst;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class InputHandler implements KeyListener {

    private boolean leftPressed;
    private boolean rightPressed;
    private boolean bottomPressed;
    private boolean topPressed;
    private boolean quitPressed;

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            topPressed = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            bottomPressed = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            leftPressed = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            rightPressed = true;
        }

        if (e.getKeyCode() == KeyEvent.VK_Q) {
            quitPressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            topPressed = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            bottomPressed = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            leftPressed = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            rightPressed = false;
        }

        if (e.getKeyCode() == KeyEvent.VK_Q) {
            quitPressed = false;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public boolean isMoving() {
        return leftPressed || rightPressed || topPressed || bottomPressed;
    }

    public boolean isLeftPressed() {
        return leftPressed;
    }

    public boolean isRightPressed() {
        return rightPressed;
    }

    public boolean isBottomPressed() {
        return bottomPressed;
    }

    public boolean isTopPressed() {
        return topPressed;
    }

    public boolean isQuitPressed() {
        return quitPressed;
    }
}
