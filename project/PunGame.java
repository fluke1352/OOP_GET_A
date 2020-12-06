/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;

/**
 *
 * @author Fluke
 */
public class PunGame extends JPanel  {
public int px = 5, py = 720;

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        image img = new image();
        g.drawImage(img.punmap, 0, 0, 800, 800, this);
        g.drawImage(img.ghostright, this.px, this.py, 40, 40, this);
    }


   

}
