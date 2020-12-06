/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import static project.image.flukemap;

/**
 *
 * @author Fluke
 */
public class Flukebattlemap extends JPanel implements ActionListener {
    Flukebattleplayer py;
    Flukebattleboss bs;
    image img;
    public Timer loop;



    public Flukebattlemap(){
        loop = new Timer(10, this);
        loop.start();
        img = new image();
//        py = new FlukedPlayer(15, 750);
        py = new Flukebattleplayer(10, 500);
        bs = new Flukebattleboss(700, 200);
        addKeyListener(py);
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
//        System.out.println("AAASDADASDASDASDASDSA");
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
//        image img = new image();
        g2.drawImage(img.map, 0, 0, 1000, 700, null);
        py.update();
        bs.update();
        py.draw(g2);
        bs.draw(g2);

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