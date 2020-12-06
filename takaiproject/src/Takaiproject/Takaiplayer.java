package Takaiproject;

import javax.swing.*;
import java.awt.*;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

public class Takaiplayer extends JPanel implements KeyListener {
    public int x, y, prex,prey;
    image img;
    public int stackx = 0, stacky = 0;
    BufferedImage pic = img.ghosttop;

    public Takaiplayer(int x, int y) {
        img = new image();
        this.x = x;
        this.y = y;
    }
    public void update(){
        this.x += 20;
    }

    public void draw(Graphics2D g2d){
        if(y > 755){y-=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
        if(x == 20){x+=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
        if(x < 350 && y >= 560)
        {
            x+=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }
        if( x >= 420 && y>=560)
        {
            x-=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }
        
        /*ดักหญ้าอันแรก*/
        if(y >= 550)
        {
            if(x < 336){y-=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
            else if(x > 415){y-=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
        }
        
        /*หญ้ากั้นตรงกลางซีกซ่้าย*/
        if(x == 355 && y <=685 && y >=515){x-=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
         /*หญ้ากั้นตรงกลางซีกขวา*/
        if(x == 405 && y <=685 && y >=515){x+=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}

        
        /*ตรงทางเดินปากทางเข้าพท.ทราย*/
        if(y==510)
        {
            /*ฝั่งซ้าย*/
            if(x>= 160 && x<=200){
                g2d.drawImage(pic, this.x, this.y, 40, 40, this);
            }
            /*ฝั่งขวา*/
            else if(x>= 595 && x<=625){
                g2d.drawImage(pic, this.x, this.y, 40, 40, this);
            }
            else{y+=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
        }
        
        /*กั้นด้านข้างของปากทางเข้าพท.ทราย ซ้าย*/
        if(x == 155 && (y >= 440 && y<= 510)){x+=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
        if(x == 200  && (y >= 440 && y<= 510)){x-=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
        
        /*กั้นด้านข้างของปากทางเข้าพท.ทราย ขวา*/
        if(x == 595 && (y >= 440 && y<= 510)){x+=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
        if(x == 625  && (y >= 440 && y<= 510)){x-=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}

        /*กั้นกำแพง*/
        if(y == 425)
        {
            if(x>= 595 && x<=625){
                g2d.drawImage(pic, this.x, this.y, 40, 40, this);
            }
            else if(x>= 160 && x<=200){
                g2d.drawImage(pic, this.x, this.y, 40, 40, this);
            }
            else
            {
                y-=5;
                g2d.drawImage(pic, this.x, this.y, 40, 40, this);
            }
        }
        
        /*กั้นก่อนออกจากกำแพง*/
        if(y == 265)
        {
            if(x == 380 || x == 385){
                g2d.drawImage(pic, this.x, this.y, 40, 40, this);
            }
            else{
                y+=5;
                g2d.drawImage(pic, this.x, this.y, 40, 40, this);
            } 
        }
        
        /*กั้นด้านข้างทางเดินลาวา*/
        if(x == 375 && (y >= 90 && y<= 256)){x+=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
        if(x == 385 && (y >= 90 && y<= 256)){x-=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
       
        if(y==85)
        {
            if(x == 380 || x == 385){
                g2d.drawImage(pic, this.x, this.y, 40, 40, this);
            }
            else
            {
              y-=5;
              g2d.drawImage(pic, this.x, this.y, 40, 40, this);
            }
        }
        
        if(y==15){y+=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
        
        if(x == 240 && y >= 20 && y<= 80){x+=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
        if(x == 505 && y >= 20 && y<= 80){x-=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}

        if(x == 705 && y >=515 && y <= 545 ){
           x -= 5;
           g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }
        
        if(x == 750){x-=5;g2d.drawImage(pic, this.x, this.y, 40, 40, this);}
        
        if(y == 690 && x >=365 && x <=395)
        {
            y+=5;
            g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }
            
        else{
            g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        }
        
    
        
        
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
