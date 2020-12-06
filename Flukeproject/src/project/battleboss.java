package project;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.*;
import static project.image.flukeboss;

public class battleboss extends JPanel {

    public int x, y, prex, prey, n;
    image img;
    public int stackx = 0, stacky = 0;
    BufferedImage pic = img.flukeboss;

    public battleboss(int x, int y) {
        img = new image();
        this.x = x;
        this.y = y;
//        this.addKeyListener(this);
    }

    battleboss() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update() {
        Random rand = new Random();
        int n = rand.nextInt(10);
//        this.y = n * 1;
//        battlemap.;
//        System.out.println(n);

//        if(n % 2 == 0){
//            this.y += n*2;
//        }
//        else if(n % 2 != 0){
//            this.y -= n*2;
//        }
    }

    public void draw(Graphics2D g2d) {
//        System.out.println(x + "," +y);
//        g2d.drawImage(pic, this.x, this.y, 40, 40, this);

        if (this.y < 0) {
            this.y = 0;
        }
        if (this.y > 500) {
            this.y = 500;
        }
//            System.out.println(n);
        if (this.x == battleplayer.kx && this.y == battleplayer.ky) {
                System.out.println("eiei");
        }
        g2d.drawImage(pic, this.x, this.y, 250, 250, this);

//        System.out.println("aaaa");
    }

}
