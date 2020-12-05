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

/**
 *
 * @author Fluke
 */
public class FlukeGame extends JPanel implements ActionListener {
    FlukePlayer py;
    image img;
    Timer loop;


    public FlukeGame(){
        loop = new Timer(10, this);
        loop.start();
        img = new image();
        py = new FlukePlayer(15, 750);
//        py = new player(200, 200);
        addKeyListener(py);
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
//        System.out.println("AAASDADASDASDASDASDSA");
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
//        image img = new image();
        g2.drawImage(img.fluketomap, 0, 0, 800, 800, null);
        py.draw(g2);
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
