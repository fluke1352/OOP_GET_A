/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

/**
 *
 * @author Fluke
 */
public class game extends JPanel implements ActionListener{
    Timer loop;
    Player player;


    public game() {
        loop = new Timer(10, this);
        loop.start();
        player  = new Player(40, 750);
        addKeyListener(player);
        setFocusable(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2d = (Graphics2D) g;
        image img = new image();
        g.drawImage(img.map144, 0, 0, 800, 800, this);
        player.draw(g2d);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
        player.update();
        }catch(Exception ex){
        ex.printStackTrace();
        }
        repaint();
    }

}
