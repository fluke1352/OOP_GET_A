package project;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

public class battleplayer extends JPanel implements KeyListener{
    public static int x, y, prex,prey, stack, kx, ky;
    image img;
    public int stackx = 0, stacky = 0;
    BufferedImage pic = img.ghostright, kame = img.kame;
    

    public battleplayer(int x, int y) {
        img = new image();
        this.x = x;
        this.y = y;
//        this.addKeyListener(this);
    }

    battleplayer() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(){
//        this.x += 20;
        
    }

    public void draw(Graphics2D g2d){
//        System.out.println(x + "," +y);
//        g2d.drawImage(pic, this.x, this.y, 40, 40, this);
            if(this.y < 10){
                this.y += 15;
            }
            if(this.y > 540){
                this.y -= 15;
            }
            if(this.x < 10){
                this.x += 15;
            }
            g2d.drawImage(pic, this.x, this.y, 100, 100, this);
            
            if(stack == 1){
                this.kx += 15;
                
                g2d.drawImage(kame, this.kx, this.ky, 100, 100, this);
                if(this.kx == 900){
                    this.kx = 0;
                    stack = 0;
                }
            }
            

//        System.out.println("aaaa");
    }

    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            pic = img.ghosttop;
//            System.out.println(stackx + "a"+ stacky);
                System.out.println(x + "," +y);
                this.y -= 15;
        }


        if (e.getKeyCode() == KeyEvent.VK_S) {
            pic = img.ghostdown;
                System.out.println(x + "," +y);
                this.y += 15;

        }


//        if (e.getKeyCode() == KeyEvent.VK_A) {
//            pic = img.ghostleft;
//            System.out.println(x + "," +y);
//            this.x -= 10;
//        }
//
//
//        if (e.getKeyCode() == KeyEvent.VK_D) {
//            pic = img.ghostright;
//                System.out.println(x + "," +y);
//                this.x += 10;
//        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            stack = 1;
            pic = img.ghostright;
            this.ky = this.y;
//            this.kx = this.x;
            System.out.println("kamekamaha");
        }
    }




    public void keyReleased(KeyEvent e) {

    }


  }
