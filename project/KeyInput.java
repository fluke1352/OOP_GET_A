package project;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class KeyInput extends KeyAdapter{
    TuuPlayer p;

    public KeyInput(TuuPlayer p) {
        this.p = p;
    }
    @Override
    public void keyTyped(KeyEvent ke){
    
    }
    @Override
    public void keyPressed(KeyEvent ke){
        p.keyPressed(ke);
    }
    public void keyReleased(KeyEvent ke){
        p.keyReleased(ke);
    }

}
