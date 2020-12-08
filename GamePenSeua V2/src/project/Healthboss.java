package project;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Healthboss {
    private useSound us;
   public static int damage;
    image img;
    BufferedImage pic = img.bossheart;
    public Healthboss(int damage, useSound us) {
        this.damage = damage;
        this.us = us;
    }

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
            Battle.fr.dispose();
            us.stop();
        }
    }
}
