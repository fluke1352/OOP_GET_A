package project;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.*;
import static project.Flukebattleplayer.stack;
import static project.image.flukeboss;

public class Flukebattleboss extends JPanel {

    public static int x, y, prex, prey, n = 1, kx, ky, stack = 0;
    image img;
    public int stackx = 0, stacky = 0, mili = 0;
    BufferedImage pic = img.flukeboss, bskame = img.bskame;

    public Flukebattleboss(int x, int y) {
        img = new image();
        this.x = x;
        this.y = y;
        
//        this.addKeyListener(this);
    }

    Flukebattleboss() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update() {
//        Random rand = new Random();
//        int n = rand.nextInt(10);
        this.mili += 10;
        if (this.mili == 700) {
            kame();
        }
//        this.y = n*41;
//        if(n % 2 == 0){
//            this.y += n*2;
//        }
//        else if(n % 2 != 0){
//            this.y -= n*2;
//        }
    }

    public void draw(Graphics2D g2d) {
        System.out.println(mili);
//        g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        this.y += 10*n;
        if (this.y < 0) {
            this.y = 0;
            n = 1;
        }
        if (this.y > 400) {
            this.y = 400;
            n = -1;
        }
//            System.out.println(n);
        if (this.x == Flukebattleplayer.kx && this.y == Flukebattleplayer.ky) {
            System.out.println("eiei");
        }
        g2d.drawImage(pic, this.x, this.y, 250, 250, this);
        
        if (this.stack == 1) {
            this.kx -= 40;

            
            if (this.kx < 0) {
                this.kx = 1000;
                this.stack = 0;
                this.mili = 0;
            }
            g2d.drawImage(bskame, this.kx, this.ky, 150, 150, this);
        }
        
        checkhit();

//        System.out.println("aaaa");
    }
    
    public void kame(){
            stack = 1;
            this.kx = this.x;
            this.ky = this.y;
//            this.kx = this.x;
            System.out.println("kamekamaha");
        
    }
     public Rectangle HitBoxBoss(){
        return new Rectangle(x,y,250,250);
    }
     public static Rectangle getBossBulletBounds() {
        return new Rectangle(kx, ky, 100, 100);
    }
    
    public void checkhit(){
         if (HitBoxBoss().intersects(Flukebattleplayer.getBulletBounds())){
                System.out.println("playerยิงบอส");
            }
    }

}
