package project;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class keyboradInput extends KeyAdapter {
    Player p;

    public keyboradInput(Player p){
        this.p = p;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        p.keyPressed(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        p.keyReleased(e);
    }
}
