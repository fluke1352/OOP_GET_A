package project3;
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
        }
            if(Flukebattleplayer.hp == 0){
                Flukebattle.fr.dispose();
                Flukebattleplayer.hp = 6;
            }
            
             if(Macbattleplayer.hp == 0){
                Macbattle.fr.dispose();
                Macbattleplayer.hp = 6;
            }
              if(Takaibattleplayer.hp == 0){
               Takaibattle.fr.dispose();
                Takaibattleplayer.hp = 6;
            }
               if(Tubattleplayer.hp == 0){
                Tubattle.fr.dispose();
                Tubattleplayer.hp = 6;
            }
                if(Punbattleplayer.hp == 0){
                Punbattle.fr.dispose();
                Punbattleplayer.hp = 6;
            }
            
            
            
            
            
        
//                g2d.setColor(Color.GREEN);
//		g2d.fillRect(200, 550, width, height);
//		g2d.setColor(Color.RED);
//		g2d.drawRect(200, 550, width - 1, height - 1);

    }
}
