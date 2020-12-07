/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project3;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static project3.image.macMap;

/**
 *
 * @author Fluke
 */
public class Macbattlemap extends JPanel implements ActionListener {
    Macbattleplayer py;
    Macbattleboss bs;
    image img;
    Health hb;
    bossHealth bh;
    public Timer loop;



    public Macbattlemap(){
        loop = new Timer(10, this);
        loop.start();
        img = new image();
//        py = new FlukedPlayer(15, 750);
        py = new Macbattleplayer(10, 200);
        bs = new Macbattleboss(700, 200);
        hb = new Health(6);
        bh = new bossHealth(10);
        addKeyListener(py);
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
//        System.out.println("AAASDADASDASDASDASDSA");
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
//        image img = new image();
        g2.drawImage(img.macMap, 0, 0, 1000, 700, null);
        py.update();
        bs.update();
        py.draw(g2);
        bs.draw(g2);
        hb.draw(g2);
        bh.draw(g2);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println(py.x);
//            py.update();
//        py.fluke();
//        a.f();
        repaint();
    }
}
