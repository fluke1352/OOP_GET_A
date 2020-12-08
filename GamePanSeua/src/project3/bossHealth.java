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
public class bossHealth {
   public static int damage;
    image img;
    BufferedImage pic = img.bossheart;
    public bossHealth(int damage) {
        this.damage = damage;
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
        }

        if(Flukebattleboss.hp == 0){
                Flukebattle.fr.dispose();
                Flukebattleboss.hp = 6;
                Flukebattleplayer.hp = 6;
                SelectBoss.jLabel4.setVisible(false);
                SelectBoss.st++;
                Flukebattle.stop();
                if(SelectBoss.st != 5){
                    GameMenu.se. setVisible(true);
                }
                else{
                    EndGame mac = new EndGame();
                    mac.setVisible(true);
                }
            }
            
             if(Macbattleboss.hp == 0){
                Macbattle.fr.dispose();
                Macbattleboss.hp = 6;
                Macbattleplayer.hp = 6;
                SelectBoss.jLabel8.setVisible(false);
                SelectBoss.st++;
                Macbattle.stop();
                 if(SelectBoss.st != 5){
                     GameMenu.se.setVisible(true);
                 }
                 else{
                     EndGame mac = new EndGame();
                     mac.setVisible(true);
                 }
             }
              if(Takaibattleboss.hp == 0){
               Takaibattle.fr.dispose();
                Takaibattleboss.hp = 6;
                Takaibattleplayer.hp = 6;
                SelectBoss.jLabel2.setVisible(false);
                SelectBoss.st++;
                Takaibattle.stop();
                  if(SelectBoss.st != 5){
                      GameMenu.se.setVisible(true);
                  }
                  else{
                      EndGame mac = new EndGame();
                      mac.setVisible(true);
                  }
            }
               if(Tubattleboss.hp == 0){
                Tubattle.fr.dispose();
                Tubattleboss.hp = 6;
                Tubattleplayer.hp = 6;
                SelectBoss.jLabel5.setVisible(false);
                SelectBoss.st++;
                Tubattle.stop();
                   if(SelectBoss.st != 5){
                       GameMenu.se.setVisible(true);
                   }
                   else{
                       EndGame mac = new EndGame();
                       mac.setVisible(true);
                   }
            }
                if(Punbattleboss.hp == 0){
                Punbattle.fr.dispose();
                Punbattleboss.hp = 6;
                Punbattleplayer.hp = 6;
                SelectBoss.jLabel1.setVisible(false);
                SelectBoss.st++;
                Punbattle.stop();
                    if(SelectBoss.st != 5){
                        GameMenu.se.setVisible(true);
                    }
                    else{
                        EndGame mac = new EndGame();
                        mac.setVisible(true);
                    }
            }

    }
}
