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
public class bossHealth {
   public static int damage;
    image img;
    BufferedImage pic = img.bossheart;
    public bossHealth(int damage) {
        this.damage = damage;
    }
    
    

//    public static void main(String[] args) {
//        int health = 50;
//        displayHealth(health);
//        health = health - 2;
//        displayHealth(health);
//    }
//
//    private static void displayHealth(int h) {
////        System.out.print("Health: ");
////        for(int i = 0; i<h; i=i+1){
////            System.out.print("*");
////        }
////        System.out.println("");
//        JProgressBar health = new JProgressBar(0, 50);
//        health.setStringPainted(true);
//        health.setForeground(Color.GREEN);
//    
//    }
//
//    void draw(Graphics2D g2d) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public void draw(Graphics2D g2d) {
        if(damage == 1){
            g2d.drawImage(pic,925,625,42, 42, null);
        }else if(damage == 2){
            g2d.drawImage(pic,900,625,42, 42, null);
            g2d.drawImage(pic,925,625,42, 42, null);
        }else if(damage == 3){
            g2d.drawImage(pic,875,625,42, 42, null);
            g2d.drawImage(pic,900,625,42, 42, null);
            g2d.drawImage(pic,925,625,42, 42, null);
        }else if(damage == 4){
            g2d.drawImage(pic,850,625,42, 42, null);
            g2d.drawImage(pic,875,625,42, 42, null);
            g2d.drawImage(pic,900,625,42, 42, null);
            g2d.drawImage(pic,925,625,42, 42, null);
        }else if(damage == 5){
            g2d.drawImage(pic,825,625,42, 42, null);
            g2d.drawImage(pic,850,625,42, 42, null);
            g2d.drawImage(pic,875,625,42, 42, null);
            g2d.drawImage(pic,900,625,42, 42, null);
            g2d.drawImage(pic,925,625,42, 42, null);
        }else if(damage == 6){
            g2d.drawImage(pic,800,625,42, 42, null);
            g2d.drawImage(pic,825,625,42, 42, null);
            g2d.drawImage(pic,850,625,42, 42, null);
            g2d.drawImage(pic,875,625,42, 42, null);
            g2d.drawImage(pic,900,625,42, 42, null);
            g2d.drawImage(pic,925,625,42, 42, null);
        }else if(damage == 7){
            g2d.drawImage(pic,775,625,42, 42, null);
            g2d.drawImage(pic,800,625,42, 42, null);
            g2d.drawImage(pic,825,625,42, 42, null);
            g2d.drawImage(pic,850,625,42, 42, null);
            g2d.drawImage(pic,875,625,42, 42, null);
            g2d.drawImage(pic,900,625,42, 42, null);
            g2d.drawImage(pic,925,625,42, 42, null);
        }else if(damage == 8){
            g2d.drawImage(pic,750,625,42, 42, null);
            g2d.drawImage(pic,775,625,42, 42, null);
            g2d.drawImage(pic,800,625,42, 42, null);
            g2d.drawImage(pic,825,625,42, 42, null);
            g2d.drawImage(pic,850,625,42, 42, null);
            g2d.drawImage(pic,875,625,42, 42, null);
            g2d.drawImage(pic,900,625,42, 42, null);
            g2d.drawImage(pic,925,625,42, 42, null);
        }else if(damage == 9){
            g2d.drawImage(pic,750,625,42, 42, null);
            g2d.drawImage(pic,775,625,42, 42, null);
            g2d.drawImage(pic,800,625,42, 42, null);
            g2d.drawImage(pic,825,625,42, 42, null);
            g2d.drawImage(pic,850,625,42, 42, null);
            g2d.drawImage(pic,875,625,42, 42, null);
            g2d.drawImage(pic,900,625,42, 42, null);
            g2d.drawImage(pic,925,625,42, 42, null);
        }else if(damage == 9){
            g2d.drawImage(pic,725,625,42, 42, null);
            g2d.drawImage(pic,750,625,42, 42, null);
            g2d.drawImage(pic,775,625,42, 42, null);
            g2d.drawImage(pic,800,625,42, 42, null);
            g2d.drawImage(pic,825,625,42, 42, null);
            g2d.drawImage(pic,850,625,42, 42, null);
            g2d.drawImage(pic,875,625,42, 42, null);
            g2d.drawImage(pic,900,625,42, 42, null);
            g2d.drawImage(pic,925,625,42, 42, null);
        }else if(damage == 10){
            g2d.drawImage(pic,700,625,42, 42, null);
            g2d.drawImage(pic,725,625,42, 42, null);
            g2d.drawImage(pic,750,625,42, 42, null);
            g2d.drawImage(pic,775,625,42, 42, null);
            g2d.drawImage(pic,800,625,42, 42, null);
            g2d.drawImage(pic,825,625,42, 42, null);
            g2d.drawImage(pic,850,625,42, 42, null);
            g2d.drawImage(pic,875,625,42, 42, null);
            g2d.drawImage(pic,900,625,42, 42, null);
            g2d.drawImage(pic,925,625,42, 42, null);
        }else if(damage == 0){
            Flukebattle.fr.dispose();
        }
//                g2d.setColor(Color.GREEN);
//		g2d.fillRect(200, 550, width, height);
//		g2d.setColor(Color.RED);
//		g2d.drawRect(200, 550, width - 1, height - 1);

    }
}
