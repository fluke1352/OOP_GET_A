/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Takaiproject;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import static Takaiproject.image.takaimap;

public class Takaigame extends JPanel implements ActionListener {
    Takaiplayer py;
    image img;
    Timer loop;


    public Takaigame(){
        loop = new Timer(10, this);
        loop.start();
        img = new image();
        py = new Takaiplayer(350, 750);
        addKeyListener(py);
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(img.takaimap, 0, 0, 800, 800, null);
        py.draw(g2);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
