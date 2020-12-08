package project;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.*;

public class Battle_Boss extends JPanel {
    private useSound us;
    private int index;
    private Random rand;
    private BufferedImage bskame;
    public static int x, y, prex, prey, n = 1, kx, ky, stack = 0;
    image img;
    public int stackx = 0, stacky = 0, mili = 0;
    BufferedImage pic = img.boss_5;

    public Battle_Boss(int x, int y, useSound us) {
        this.x = x;
        this.y = y;
        this.us = us;

        img = new image();
        rand = new Random();
    }

    public void update() { 
        this.mili += 10;
        if (this.mili == 700) {
            kame();
        }
    }

    public void draw(Graphics2D g2d) {
        Random rand = new Random();
        int v = rand.nextInt(10);
        
        this.y += 10*n*v*0.35;
        
        if (this.y < 0) {
            this.y = 0;
            n = 1;
        }
        if (this.y > 400) {
            this.y = 400;
            n = -1;
        }
        g2d.drawImage(pic, this.x, this.y, 250, 300, this);
        
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
    }
    
    public void kame(){
        index = rand.nextInt(img.list_bskame.size() - 1);
        bskame = img.list_bskame.get(index);
        stack = 1;
        this.kx = this.x;
        this.ky = this.y;
        us.bossATK();
    }
     public Rectangle HitBoxBoss(){
        return new Rectangle(x,y,250,250);
    }
     public static Rectangle getBossBulletBounds() {
        return new Rectangle(kx, ky, 100, 100);
    }
    
    public void checkhit(){
         if (HitBoxBoss().intersects(Battle_Player.getBulletBounds())){
                Battle_Player.kx = 1200;
                Healthboss.damage--;
            }
    }

}
