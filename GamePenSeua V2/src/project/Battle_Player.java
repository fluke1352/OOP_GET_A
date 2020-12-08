package project;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Battle_Player extends JPanel implements KeyListener {
    private useSound us;

    public static int x, y, prex, prey, stack, kx, ky;
    image img;
    public int stackx = 0, stacky = 0;
    BufferedImage pic = img.ghostright, kame = img.kame_1;


    public Battle_Player(int x, int y, useSound us) {
        img = new image();
        this.x = x;
        this.y = y;
        this.us = us;
    }
    public void draw(Graphics2D g2d) {

        if (this.y < 10) {
            this.y += 15;
        }
        if (this.y > 540) {
            this.y -= 15;
        }
        if (this.x < 10) {
            this.x += 15;
        }
        g2d.drawImage(pic, this.x, this.y, 100, 100, this);

        if (stack == 1) {
            this.kx += 15;

            g2d.drawImage(kame, this.kx, this.ky, 100, 100, this);
            if (this.kx >= 900) {
                this.kx = 0;
                stack = 0;
            }
        }
        checkhit();
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            pic = img.ghosttop;
            this.y -= 15;
        }

        if (e.getKeyCode() == KeyEvent.VK_S) {
            pic = img.ghostdown;
            this.y += 15;

        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            stack = 1;
            pic = img.ghostright;
            this.ky = this.y;
            us.playerATK();
        }
    }

    public void keyReleased(KeyEvent e) {

    }

    public static Rectangle getBulletBounds() {
        return new Rectangle(kx, ky, 100, 100);
    }

    public static Rectangle HitBoxPlayer() {
        return new Rectangle(x, y, 100, 100);
    }

    public void checkhit() {
        if (HitBoxPlayer().intersects(Battle_Boss.getBossBulletBounds())) {
            Battle_Boss.kx = -20;
            HealthPlayer.damage--;

        }
    }

}
