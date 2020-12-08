/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import static project.image.flukemap;

/**
 *
 * @author Fluke
 */
public class game extends JPanel implements ActionListener {
    Timer loop;
    Player user = new Player(10,80);

    public game(){
        loop = new Timer(10, this);
        loop.start();
        addKeyListener(new keyboradInput(user));
        setFocusable(true);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        image img = new image();

        g.drawImage(img.flukemap, 0, 0, 800, 800, this);
        user.draw(g2,img,this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        user.upDate();
        repaint();
    }
}
