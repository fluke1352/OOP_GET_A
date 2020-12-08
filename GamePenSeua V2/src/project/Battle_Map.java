/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

/**
 *
 * @author Fluke
 */
public class Battle_Map extends JPanel implements ActionListener {
    private int index;
    Battle_Player py;
    Battle_Boss bs;
    image img = new image();
    HealthPlayer hb;
    Healthboss bh;
    public Timer loop;




    public Battle_Map(useSound us){
        loop = new Timer(10, this);
        loop.start();
        py = new Battle_Player(10, 200, us);
        bs = new Battle_Boss(700, 200, us);
        hb = new HealthPlayer(6, us);
        bh = new Healthboss(10 , us);
        addKeyListener(py);
        setFocusable(true);

        Random rand = new Random();
        index = rand.nextInt(img.list_map.size()-1);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2 = (Graphics2D) g;
        g2.drawImage(img.list_map.get(index), 0, 0, 1000, 700, null);
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
