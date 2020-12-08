/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import static project3.image.flukemap;

/**
 *
 * @author Fluke
 */
public class Tubattlemap extends JPanel implements ActionListener {
    Tubattleplayer py;
    Tubattleboss bs;
    image img;
    Health hb;
    bossHealth bh;
    public Timer loop;

    public Tubattlemap(){
        loop = new Timer(10, this);
        loop.start();
        img = new image();
//        py = new FlukedPlayer(15, 750);
        py = new Tubattleplayer(10, 500);
        bs = new Tubattleboss(700, 200);
        hb = new Health(6);
        bh = new bossHealth(10);
        addKeyListener(py);
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(img.tumap, 0, 0, 1000, 700, null);
        bs.update();
        py.draw(g2);
        bs.draw(g2);
        hb.draw(g2);
        bh.draw(g2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
