package project3;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.util.*;
import static project3.Takaibattleplayer.stack;
import static project3.image.*;


public class Takaibattleboss extends JPanel {

    public static int x, y, prex, prey, n = 1, kx, ky, stack = 0, hp = 10;
    image img;
    public int stackx = 0, stacky = 0, mili = 0;
    BufferedImage pic = img.Takaiboss, bskame = img.Takaibskame;
    double speed = 3;

    public Takaibattleboss(int x, int y) {
        img = new image();
        this.x = x;
        this.y = y;

    }

    Takaibattleboss() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update() { 
        this.mili += 10;
        if (this.mili == 700) {
            kame();
        }
    }

    public void draw(Graphics2D g2d) {
        this.y += n*speed;
        
        if (this.y < 0) {
            this.y = 0;
            n = 1;
        }
        if (this.y > 400) {
            this.y = 400;
            n = -1;
        }
        g2d.drawImage(pic, this.x, this.y, 200, 200, this);
      if(speed > 40)
            {
                speed = -10;
            }
        if(speed <= 40)
            {
                speed += (int)(Math.random() * (5) + 0);
                
            }
        if (this.stack == 1) {
            this.kx -= (double)(Math.random() * (40 - 0 + 1) + 1);
            if (this.kx < 0) {
                this.kx = 1000;
                this.stack = 0;
                this.mili = 0;
            }
            g2d.drawImage(bskame, this.kx, this.ky, 300, 300, this);

        }
        
        checkhit();

    }
    
    public void kame(){
            stack = 1;
            this.kx = this.x;
            this.ky = this.y;
        useSound.bossATK();
        
    }
     public Rectangle HitBoxBoss(){
        return new Rectangle(x,y,250,250);
    }
     public static Rectangle getBossBulletBounds() {
        return new Rectangle(kx, ky, 200, 200);
    }
    
    public void checkhit(){
         if (HitBoxBoss().intersects(Takaibattleplayer.getBulletBounds())){
                Takaibattleplayer.kx = 1200;
                bossHealth.damage--;
                hp--;
            }
    }

}
