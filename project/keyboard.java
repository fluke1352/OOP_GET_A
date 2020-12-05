package project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keyboard extends KeyAdapter {
    PunPlayer p;

    public keyboard(PunPlayer p) {
        this.p = p;
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
//            player.key
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
