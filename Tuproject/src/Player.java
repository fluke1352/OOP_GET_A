
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Player extends JPanel implements KeyListener{
    private int x,y;
    private int px = 0;
    private int py = 0;
    image img;
    BufferedImage pic = img.right;
    
    public Player(int x, int y) {
        img = new image();
        this.x = x;
        this.y = y;
    }

    Player() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void update(){
        x+= px;
        y += py;
        
    }
    
    public void draw(Graphics2D g2d) {
        g2d.drawImage(pic, this.x, this.y, 40, 40, this);
        if (x <= 0){ //กรอบ
            x = 0;
        }if (x== 40 && y==750){ //กรอบ
            g2d.drawImage(img.back, this.x, this.y, 40, 40, this);
        }if (y<= 75){ //กรอบ
            y = 75;
        }if(y>=780){ // ล่าง
            y = 780;
        }if(x>=780 && y<420){
            x = 780;
        }if (x>290&&x< 520 &&y > 430 &&y<700){ //ขอบขวา1
            x =50;
            y = 750;
        }if (x<20 && y> 630){ //ขอบซ้าย1
            x = 20;
        }if (x>710 && y> 500){ //ขวาสุด
            x = 710;    
        }if (x>685 &&x<690   && y> 400){ //ขวา
            x = 690;  
        }if(y<628 &&y>500 &&x < 300){ //ขอบบน1
            y= 628;
        }if(y> 570&&y<628 && x < 680 ){ //ขอบบน2
            y= 628;
        }if (y>200&&y < 280&&x>430 && x<780){
            y =280;
        }if (y > 400&&y<410&&x>430 && x<680){
            y =400;
        }if (x>290 && x<300 && y< 410&& y > 150){ //ขอบขวาบน
            x = 290;

        }  
    }
    
    public void keyPressed(KeyEvent ke){
        if (ke.getKeyCode() == 37) { //Left
            pic = img.left;
            this.px -= 4;
        } else if (ke.getKeyCode() == 38) { //Up
            pic = img.back;
            this.py -= 4;
        } else if (ke.getKeyCode() == 39) { //Right
            pic = img.right;
            this.px += 4;
        } else if (ke.getKeyCode() == 40) { //Down
            pic = img.front;
            this.py += 4;
        }

    }
    public void keyReleased(KeyEvent ke){   
    int key = ke.getKeyCode();
    if (ke.getKeyCode() == 37) { //Left
            this.px = 0;
        } else if (ke.getKeyCode() == 38) { //Up
            this.py = 0;
        } else if (ke.getKeyCode() == 39) { //Right
            this.px = 0;
        } else if (ke.getKeyCode() == 40) { //Down
            this.py = 0;
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
