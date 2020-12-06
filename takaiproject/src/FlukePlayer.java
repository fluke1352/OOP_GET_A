package project;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class FlukePlayer extends JPanel implements KeyListener {
    public int x, y, prex,prey;
    image img;
    public int stackx = 0, stacky = 0;
    BufferedImage pic = img.ghostright;

    public FlukePlayer(int x, int y) {
        img = new image();
        this.x = x;
        this.y = y;
//        this.addKeyListener(this);
    }

    public void update(){
        this.x += 20;
    }

    public void draw(Graphics2D g2d){
//        System.out.println(x + "," +y);
//        g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        if(y > 730){
//            stacky = 1;
            y -= 5;
            g2d.drawImage(pic, this.x, this.y, 40, 40, this);
//            System.out.println("don't go");
//            g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }

        if(y < 30){
            y += 5;
            g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }

        if(x < 15){
//            stackx = 2;
            x += 5;
            g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }

        if(x > 745){
            x -= 5;
            g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }

        if(x != 475 && x != 480 && y < 705 && y > 640){
            y += 5;
            g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }

        if(x != 95 && x != 90 && x != 635 && x != 640 && x != 475 && x != 480 && y < 605 && y > 540){
            y += 5;
            g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }

        if(x != 95 && x != 90 && x != 635 && x != 640 && x != 475 && x != 480 && y == 540){
            y -= 5;
        }
        if(x != 95 && x != 90 && y == 510){
            y += 5;
        }

        if(x != 95 && x != 90 && y < 510 && y > 440){
            y -= 5;
        }
        if(x == 120 && y == 440){
            x -= 5;
        }

        if(x != 95 && x != 90 &&  y < 440 && y > 375){
            y += 5;
        }
        if(x != 95 && x != 90 && y == 375){
            y -= 5;
        }

        if(x == 255 && y <= 370 && y >= 210){
            x -= 5;
        }

        if(x > 250 && y == 205){
            y -= 5;
        }
        if(x >= 250 && y == 195 && x != 705 && x != 705 && x != 710 && x != 715 && x != 720 && x != 725 && x != 735){
            y += 5;
        }

        if(y == 110 && x != 705 && x != 705 && x != 710 && x != 715 && x != 720 && x != 725 && x != 735){
            y += 5;
            x += 5;
        }
        if(x == 705 && y <= 195){
            x += 5;
        }
        if(y == 200 && x <= 245){
            y += 5;
        }
        if(x == 245 && y == 205){
            x -= 40;
            y += 25;
        }
        if(x == 205 && y >= 200 && y <= 280){
            x -= 5;
        }
        if(x >= 705 && y == 115){
            y += 5;
        }
        if(y == 120){
            new battle();
            map.fr.dispose();

        }


        else{
            g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }

//        System.out.println("aaaa");
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            pic = img.ghosttop;
//            System.out.println(stackx + "a"+ stacky);
                System.out.println(x + "," +y);
                this.y -= 5;
        }


        if (e.getKeyCode() == KeyEvent.VK_S) {
            pic = img.ghostdown;
                System.out.println(x + "," +y);
                this.y += 5;

        }


        if (e.getKeyCode() == KeyEvent.VK_A) {
            pic = img.ghostleft;
            System.out.println(x + "," +y);
            this.x -= 5;
        }


        if (e.getKeyCode() == KeyEvent.VK_D) {
            pic = img.ghostright;
                System.out.println(x + "," +y);
                this.x += 5;
        }
    }




    @Override
    public void keyReleased(KeyEvent e) {

    }

    public void fluke(){
        System.out.println(y);
    }
}
