package project;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.swing.JProgressBar;
import static javax.swing.Spring.height;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Health {
    public static int damage;
    image img;
    BufferedImage pic = img.heart;
    public Health(int damage) {
       this.damage = damage;
    }



    public void draw(Graphics2D g2d) {
        if(damage == 1){
            g2d.drawImage(pic,100,630,30, 30, null);
        }else if(damage == 2){
            g2d.drawImage(pic,100,630,30, 30, null);
            g2d.drawImage(pic,125,630,30, 30, null);
        }else if(damage == 3){
            g2d.drawImage(pic,100,630,30, 30, null);
            g2d.drawImage(pic,125,630,30, 30, null);
            g2d.drawImage(pic,150,630,30, 30, null);
        }else if(damage == 4){
            g2d.drawImage(pic,100,630,30, 30, null);
            g2d.drawImage(pic,125,630,30, 30, null);
            g2d.drawImage(pic,150,630,30, 30, null);
            g2d.drawImage(pic,175,630,30, 30, null);
        }else if(damage == 5){
            g2d.drawImage(pic,100,630,30, 30, null);
            g2d.drawImage(pic,125,630,30, 30, null);
            g2d.drawImage(pic,150,630,30, 30, null);
            g2d.drawImage(pic,175,630,30, 30, null);
            g2d.drawImage(pic,200,630,30, 30, null);
        }else if(damage == 6){
            g2d.drawImage(pic,100,630,30, 30, null);
            g2d.drawImage(pic,125,630,30, 30, null);
            g2d.drawImage(pic,150,630,30, 30, null);
            g2d.drawImage(pic,175,630,30, 30, null);
            g2d.drawImage(pic,200,630,30, 30, null);
            g2d.drawImage(pic,225,630,30, 30, null);
        }else if(damage == 0){
            Takaibattle.fr.dispose();
        }
//                g2d.setColor(Color.GREEN);
//		g2d.fillRect(200, 550, width, height);
//		g2d.setColor(Color.RED);
//		g2d.drawRect(200, 550, width - 1, height - 1);

    }
}
